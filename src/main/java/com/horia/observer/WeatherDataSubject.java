package com.horia.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private float temp, humidity, pressure;

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);

	}

	@Override
	public void notifyObservers() {
		for (Observer obs : observers) {
			obs.update(temp, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObservers();

	}
	
	/**
	 * test method
	 */
	public void setMeasurements(float aTemp, float aHumidity, float aPressure) {
		temp = aTemp;
		humidity = aHumidity;
		pressure = aPressure;
		measurementChanged();
	}
}
