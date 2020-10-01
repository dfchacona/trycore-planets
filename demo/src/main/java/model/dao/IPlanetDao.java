package model.dao;
import org.springframework.data.repository.CrudRepository;
import model.entities.Planet;


public interface IPlanetDao extends CrudRepository<Planet, Integer>{

	
}
