package com.horia.observer.jdkapi;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayPull implements Observer, DisplayElement {

	private float temp, humidity, pressure;
	private Observable weatherData;

	public CurrentConditionsDisplayPull(Observable wd) {
		weatherData = wd;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("PULL temp" + temp);
		System.out.println("PULL humidity" + humidity);
		System.out.println("PULL pressure" + pressure);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		WeatherDataPull wd = (WeatherDataPull) arg0;
		if (wd instanceof WeatherDataPull) {
			temp = wd.getTemp();
			humidity = wd.getHumidity();
			pressure = wd.getPressure();
			display();
		}
	}

}
