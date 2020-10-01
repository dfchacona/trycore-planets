package com.example.planets.rest;

import java.util.List;

import com.example.planets.model.entities.Planet;
import com.example.planets.model.service.IPlanetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping (value="planetlist")
public class PlanetList {

	@Autowired
	private IPlanetService planetService;

	@GetMapping(value="planets")
	public List<Planet> getPlanets() {
		return planetService.getPlanet();
	}


    @GetMapping(value="all")
    public String getFunco() {
        return "Funco ";
    }


	
	
	
}