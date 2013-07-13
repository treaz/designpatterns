package com.horia.observer;

public class CurrentConditionsDisplayObserver implements Observer, IDisplayElement {

	private float temp, humidity, pressure;
	private Subject weatherData;

	public CurrentConditionsDisplayObserver(Subject wd) {
		weatherData = wd;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("temp" + temp);
		System.out.println("humidity" + humidity);
		System.out.println("pressure" + pressure);
	}

	@Override
	public void update(float _temp, float _humidity, float _pressure) {
		temp = _temp;
		humidity = _humidity;
		pressure = _pressure;
		display();
	}

}
