package com.bridgelabz.demoRest;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cities")
public class CityResource {
	
	CityDao dao = new CityDao();
	@GET
	@Path("/getCities")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> getCity(){
		
		return dao.getAllCity();
	}
	
	@GET
	@Path("/getCities/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public City cityById(@PathParam("id") int cityId){

		return dao.getCityById(cityId);
	}
	
	@POST
	@Path("/addCity")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> addCity(City city){
		dao.createCity(city);
		return dao.getAllCity();
	}

}
