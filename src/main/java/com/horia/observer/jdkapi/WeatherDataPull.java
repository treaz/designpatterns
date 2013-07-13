package com.horia.observer.jdkapi;

import java.util.Observable;

public class WeatherDataPull extends Observable {

	private float temp, humidity, pressure;

	public void measurementChanged() {
		setChanged();
		notifyObservers();

	}
	
	/**
	 * test method
	 */
	public void setMeasurements(float _temp, float _humidity, float _pressure) {
		temp = _temp;
		humidity = _humidity;
		pressure = _pressure;
		measurementChanged();
	}

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}
