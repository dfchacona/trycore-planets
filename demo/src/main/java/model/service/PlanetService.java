package model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import model.dao.IPlanetDao;
import model.entities.Planet;

public class PlanetService implements IPlanetService{
	
	@Autowired
	private IPlanetDao planetDao;
	
	/**
	 * Method to get all the task
	 * @return
	 */
	public List<Planet> getPlanet() {
		return (List<Planet>) planetDao.findAll();
	}

}
