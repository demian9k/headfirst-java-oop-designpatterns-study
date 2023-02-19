package io.demian._13_Proxy_04_Protection.Subject;

/*
 * 결혼 정보 업체에서 사용할 인물 인터페이스
 */
public interface PersonBean {
 
	String getName();
	String getGender();
	String getInterests();
	int getHotOrNotRating();
 
    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);  //관심사들
    void setHotOrNotRating(int rating);  //이 인물의 선호도(인기도)
 
}
