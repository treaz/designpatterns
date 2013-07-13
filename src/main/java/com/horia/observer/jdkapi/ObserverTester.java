package com.horia.observer.jdkapi;

import java.util.Observable;
import java.util.Observer;

public class ObserverTester {
	public static void main(String[] args) {
		//there are 2 ways of usig the observer api: 1 the subject pushes the data to the observers
		Observable wd = new WeatherDataPush();
		Observer ccd = new CurrentConditionsDisplay(wd);
		
		((WeatherDataPush) wd).setMeasurements(80, 65, 30.4f);
		((WeatherDataPush) wd).setMeasurements(82, 70, 29.2f);
		
		// 2 the observers pull the data from the subject when they are notified
		wd = new WeatherDataPull();
		Observer ccdPull = new CurrentConditionsDisplayPull(wd);
		
		((WeatherDataPull) wd).setMeasurements(80, 65, 30.4f);
		((WeatherDataPull) wd).setMeasurements(82, 70, 29.2f);
	}
}
