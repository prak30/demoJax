package com.bridgelabz.demoRest;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
		return dao.createCity(city);

	}
	
	@DELETE
	@Path("/removeCity/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> removeCity(@PathParam("id") int cityId){

		return dao.removeCity(cityId);
	}
	
	@PUT
	@Path("/updateCity/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> updateCity(@PathParam("id") int cityId, City city){

		return dao.updateCity(cityId,city.getCityName());
	}

}
