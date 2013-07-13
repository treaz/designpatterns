package com.horia.observer.jdkapi;

public class WeatherNumbers {

	private float temp, humidity, pressure;
	
	public WeatherNumbers( float _temp, float _humidity, float _pressure) {
		temp = _temp;
		humidity = _humidity;
		pressure = _pressure;
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
