package model.entities;
@Entity
@Table(name="planets")
public class Planet implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer diameter ;
	private Double mean_climate; 
	private Integer num_visits;
	
	@Column(name="creation_date")
	private Date creationDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDiameter() {
		return diameter;
	}

	public void setDiameter(Integer diameter) {
		this.diameter = diameter;
	}

	public Double getMean_climate() {
		return mean_climate;
	}

	public void setMean_climate(Double mean_climate) {
		this.mean_climate = mean_climate;
	}

	public Integer getNum_visits() {
		return num_visits;
	}

	public void setNum_visits(Integer num_visits) {
		this.num_visits = num_visits;
	}

	
	
}