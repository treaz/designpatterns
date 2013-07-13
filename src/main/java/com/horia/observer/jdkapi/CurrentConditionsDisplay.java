package com.horia.observer.jdkapi;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temp, humidity, pressure;
	private Observable weatherData;

	public CurrentConditionsDisplay(Observable wd) {
		weatherData = wd;
		weatherData.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("PUSH temp" + temp);
		System.out.println("PUSH humidity" + humidity);
		System.out.println("PUSH pressure" + pressure);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		WeatherNumbers wn =	(WeatherNumbers) arg1;
		temp = wn.getTemp();
		humidity = wn.getHumidity();
		pressure = wn.getPressure();
		display();
	}

}
