package com.bridgelabz.demoRest;


import java.util.*;
import java.util.stream.Collectors;

public class CityDao {
	List<City> cities;
	
	public CityDao(){
		
		cities = new ArrayList<>();
		City city1 = new City(101,"banglore");
		City city2 = new City(102,"noida");
		City city3 = new City(103,"indore");
		cities.addAll(Arrays.asList(city1,city2,city3));
	}
	
	public List<City> getAllCity(){
		return cities;
	}
	
	City getCityById(int cityId){
		return cities.stream().filter(x->x.getCityId()== cityId)
				.collect(Collectors.toList()).get(0);
	}
	
	List<City> createCity(City city){
		cities.add(city);
		return cities;
	}
	
	public List<City> removeCity(int id){
		cities.removeIf(x-> x.getCityId() == id);
		return cities;
	}
	
	List<City> updateCity(int id, String cityName){
		cities.stream().filter(x->x.getCityId()== id)
		.collect(Collectors.toList()).get(0).setCityName(cityName);
		return cities;
	}

	
	
	

}
