package com.example.planets.model.service;

//import model.dao.IPlanetDao;
import com.example.planets.model.dao.IPlanetDao;
import com.example.planets.model.entities.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService implements IPlanetService {
	
	@Autowired
	private IPlanetDao planetDao;
	
	/**
	 * Method to get all the planets
	 * @return
	 */
	public List<Planet> getPlanet() {
		return (List<Planet>) planetDao.findAll();
	}

}
