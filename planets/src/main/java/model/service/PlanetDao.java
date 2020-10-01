package model.service;

@Service
public class PlanetService implements IPlanetService {
	
	@Autowired
	private IPlanetDao planetDao;
	
	/**
	 * Method to get all the task
	 * @return
	 */
	public List<Planet> getPlanet() {
		return (List<Planet>) taskPlanet.findAll();
	}
}