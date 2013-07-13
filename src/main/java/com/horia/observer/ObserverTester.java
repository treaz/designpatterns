package com.horia.observer;

public class ObserverTester {
	public static void main(String[] args) {
		WeatherDataSubject wd = new WeatherDataSubject();
		Observer ccd = new CurrentConditionsDisplayObserver(wd);
		
		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(82, 70, 29.2f);
	}
}
