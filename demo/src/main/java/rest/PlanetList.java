package rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.entities.Planet;
import model.service.IPlanetService;

@RestController
@RequestMapping (value="planetlist")
public class PlanetList {
	
	@Autowired
	private IPlanetService taskService;

	@GetMapping(value="planets")
	public List<Planet> getTasks() {
		return taskService.getPlanet();
	}
	
	
	
}