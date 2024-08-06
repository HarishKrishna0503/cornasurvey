package com.example.demo.model;

public class LocationStates 
{

	private String state;
	private String country;
	private int latestTotalDeaths;
	private int differfromprevay;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalDeaths() {
		return latestTotalDeaths;
	}
	public void setLatestTotalDeaths(int latestTotalDeaths) {
		this.latestTotalDeaths = latestTotalDeaths;
	}
	public int getDifferfromprevay() {
		return differfromprevay;
	}
	public void setDifferfromprevay(int differfromprevay) {
		this.differfromprevay = differfromprevay;
	}
	@Override
	public String toString() {
		return "LocationStates [state="+state+",country="+country+",latestTotalDeaths="+latestTotalDeaths+",differfromprevay="+differfromprevay+"]";
		
	}
	
	
}
