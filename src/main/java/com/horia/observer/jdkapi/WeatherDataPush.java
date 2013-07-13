package com.horia.observer.jdkapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherDataPush extends Observable {

	WeatherNumbers wn;

	public void measurementChanged() {
		setChanged();
		notifyObservers(wn);

	}
	
	/**
	 * test method
	 */
	public void setMeasurements(float aTemp, float aHumidity, float aPressure) {
		wn = new WeatherNumbers(aTemp,aHumidity, aPressure);
		measurementChanged();
	}
}
