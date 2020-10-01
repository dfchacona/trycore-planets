package com.example.planets.model.dao;


import com.example.planets.model.entities.Planet;
import org.springframework.data.repository.CrudRepository;


public interface IPlanetDao extends CrudRepository<Planet,Long>{

	
}
