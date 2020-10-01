package rest;


@RestController
@RequestMapping (value="planetlist")
public class PlanetList {
	
	@Autowired
	private ITaskService taskService;

	@GetMapping(value="tasks")
	public List<Task> getTasks() {
		return taskService.getTask();
	}
	
	
	
}