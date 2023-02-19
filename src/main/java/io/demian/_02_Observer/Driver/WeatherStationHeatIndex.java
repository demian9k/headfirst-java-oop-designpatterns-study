package io.demian._02_Observer.Driver;

import io.demian._02_Observer.Observer.CurrentConditionsDisplay;
import io.demian._02_Observer.Observer.ForecastDisplay;
import io.demian._02_Observer.Observer.HeatIndexDisplay;
import io.demian._02_Observer.Observer.StatisticsDisplay;
import io.demian._02_Observer.Subject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
