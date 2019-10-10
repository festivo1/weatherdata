package com.utsi.weatherApplication;

import java.util.Date;

public class WeatherData {
	
	private int id; 
	private  Date dateEntered;
	private double dewPoint;
	private double humidity; 
	private double tempr;
	
	public WeatherData() {}
	public WeatherData(int id, Date dateEntered, double dewPoint, double humidity, double tempr) {
		super();
		this.id = id;
		this.dateEntered = dateEntered;
		this.dewPoint = dewPoint;
		this.humidity = humidity;
		this.tempr = tempr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(Date dateEntered) {
		this.dateEntered = dateEntered;
	}
	public double getDewPoint() {
		return dewPoint;
	}
	public void setDewPoint(double dewPoint) {
		this.dewPoint = dewPoint;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getTempr() {
		return tempr;
	}
	public void setTempr(double tempr) {
		this.tempr = tempr;
	}
	@Override
	public String toString() {
		return "WeatherData [id=" + id + ", dateEntered=" + dateEntered + ", dewPoint=" + dewPoint + ", humidity="
				+ humidity + ", tempr=" + tempr + "]";
	} 

//    {
//      date_entered: "Fri, 27 Sep 2019 10:36:50 GMT",
//      dewpoint: 12.56,
//      humidity: 40.78,
//      id: 1,
//      tempr: 45.09
//    }
	
	
}
