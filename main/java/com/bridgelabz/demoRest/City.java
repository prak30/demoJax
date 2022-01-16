package com.bridgelabz.demoRest;

public class City {
	private int cityId;
	private String cityName;

	public City(int cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public int getCityId() {
		return cityId;
	}

	public String getCityName() {
		return cityName;
	}

}
