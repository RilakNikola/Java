package testt;

public abstract class Employees {

	private String name;
	private Theatre theatre;


	//Constructor
	public Employees(String name, Theatre theatre) {
		this.theatre = theatre;
		this.name = name;
	}

	//Getters for name and theatre
	public String getName() {
		return name;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	//Abstract method
	public abstract char jobTag();

	public char getJobTag() {
		return jobTag();
	}

	// Print in format [job_tag,theatre_name]
	public String toString() {
		StringBuilder sb = new StringBuilder(); 
		sb.append(this.getName()).append("[").append(this.getJobTag()).append(",");
		sb.append(theatre.getName()).append("] \n");
		return sb.toString();

	}

}
