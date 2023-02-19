package io.demian._02_Observer.Driver;

import io.demian._02_Observer.Observer.CurrentConditionsDisplay;
import io.demian._02_Observer.Observer.ForecastDisplay;
import io.demian._02_Observer.Observer.StatisticsDisplay;
import io.demian._02_Observer.Subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		//생성자에서 weather data 주제 객체에 옵저버로 등록한다.
		CurrentConditionsDisplay currentDisplay = 	new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		//weatherData 주제 객체에서 데이터가 감지되면 등록된 observer들에게 전달된다.
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
