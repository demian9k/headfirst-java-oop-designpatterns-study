package io.demian._05_Singleton_05_DoubleCheckingLocking;

//
// 다중 스레드 환경에서 싱글톤 패턴을 사용하는 세번째 방법 Double Checking Locking.
// DCL 을 사용한 방법은 1.5 버전 이후 부터 안정적으로 사용할 수 있다.
// 다시 말해 1.4 버전 이전까지는 사용하지 말 것
//

public class Singleton {
	
	/*
	 * volatile 키워드를 사용해 멀티스레드 환경에서도 uniqueInstance 변수를 한번만 초기화할 수 있다.
	 */
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
	
	/*
	 * 메서드에 syncronized 를 사용하는 것이 아니라 동기화 블록을 사용해 
	 * 최초 초기화시에만 syncronized 되도록 했다,
	 * 최초 초기화시에만 성능 저하를 부담하고, 그 이후에는 널 확인 if 문을 통해
	 * getInstance 호출시에 syncronized 로직으로 넘어가지 않는다.
	 * 
	 */
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}


/*
volatile?

volatile은 멀티스레딩 환경시 동기화를 해주는 녀석 맞습니다. 
읽기 쓰기시에 어떤 스레드가 값을 변경하든, 항상 최신값을 읽어갈 수 있게 해주죠.
그럼 syncronized 키워드하고는 뭐가 다른가?

작업 시 그 변수의 접근에 대해 같은 값을 읽어갈 수 있게 해주는 것은 volatile이나 syncronized나 동일합니다.


읽고 쓰기에 대한 원자성
하지만 volatile은 작업의 요소를 뺀 가시성, 즉 읽기, 쓰기동작에 대해서만 동기화가 됩니다. 
그리고 그것은 원자성(Atomic)을 가집니다
말이 어려우니 예를 들면...

int count = 10;

이라는 변수가 있다고 가정하고 스레드 A와 B가 사용한다고 가정합니다.

거의 동시간에 A스레드가 count를 읽어 조작합니다. B도 같이 count를 읽어 조작합니다.
이 경우 두 스레드간에 count의 값은 서로 동일한 값, 즉 동일한 메모리 주소를 가르키지 않습니다.
스레드는 자신만의 저장 영역에 원본의 값을 복사하여 조작하기 때문이죠.

그래서 스레드마다 count는 다른 값을 가지고 있을 수 있습니다.
A에서 변경한 값을 B에서는 영원히 읽어갈 수 없을수도 있습니다.
이런저런 과정 후에 A와 B의 스레드는 작업이 끝나면 다시 조작한 값을 원본 값으로 돌리는데 그 작업이 끝나지 않거나 배치 최적화(reordering. 밑에서 설명) 등으로 그러지 않을 수 있습니다.
그럼 변수 count는 스레드간 불일치가 일어나겠죠.

리오더링 회피

또한 변수 읽기 불일치는 일종의 최적화인 리오더링 결과로 발생하기도 합니다.
리오더링은 보통 컴파일 과정에서 일어나며, 프로그래머가 만들어낸 코드는 컴파일 될 때 좀더 빠르게 실행될 수 있도록 조작을 가하는 최적화를 거칩니다.
그러한 최적화 과정중에 읽기와 쓰기의 순서가 바뀔 수 있는데, 그럴 경우 자칫 순서가 중요한 멀티스레드 환경에서 문제가 발생할 수 있습니다.

volatile을 쓴 변수는 리오더링에서 제외되며, 항상 프로그래머가 지정한 순서로 읽기 및 쓰기를 수행합니다.

연산의 원자성

이것은 가장 처음의 문제와 같은 특성인데요.
보통 변수의 쓰기 읽기는 일견 원자성(누군가 끼어들 틈이 없는 완벽한 작업단위로 이해합시다...)을 띌 수도 있어 보입니다만, 실제 count에 변수가 할당될 때 완벽히 한 메모리 작업 안에서 완벽히 쓰여지지 않습니다.

아, int같은 데이터 타입은 한번에 씁니다...;
그러나 그보다 더 큰 타입, long이나 객체..그리고 변수 할당 및 연산 시 일어나는 작업에서는 완벽히 원자성을 가지지 않고 여러번에 걸쳐 메모리 작업이 일어납니다.
(엄밀히 말하면 JVM 구현에 따라 다를 수 있다고 합니다...)

long stat = 324L;

위 코드에서 long은 데이터형이 8바이트. 즉 64비트입니다. 자바는 여기에 변수를 할당할 때 32비트 단위로 끊어서 할당합니다. 첫 32비트 할당 그다음 32비트 할당...
첫 32비트를 할당했을때 다른 스레드가 값을 읽어간다면...? 정상적이지 않은 상황이 나오겠죠 (물론 무지하게 짧은 순간입니다)

stat 변수가 volatile 키워드 변수라면 할당이 원자성을 가지게 되어 문제가 발생하지 않습니다.

syncronized랑 다를게 없네? 아닙니다.
아래 코드를 보면

int val = stat + 10;

이 코드는 val에 volatile 선언을 해 둬도, 멀티 스레딩 시 위험합니다.
분명 스레드의 접근 순서에 따라 val의 값을 어떤 스레드는 10을 더한값을 가져가기도 하고, 어떤 스레드는 10을 더하지 않은 값을 읽기도 할것입니다.
위 코드의 작업은 stat을 int로 캐스팅하고 10을 더하고 다시 val에 할당하는 3가지의 작업을 거치기 때문이죠.

syncronized는 이럴 때 작업자체를 원자화해버립니다.
volatile이 할 수 없는 일이죠.
*/
