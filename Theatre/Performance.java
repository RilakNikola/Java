package testt;

public class Performance {

	private String performanceTitle;
	private Theatre theatre;
	private Employees[] number;

	// Constructor
	public Performance(String performanceTitle, Theatre theatre, int k) {
		this.performanceTitle = performanceTitle;
		this.theatre = theatre;
		number = new Employees[k];
	}

	// Method to add an employee to performance
	public boolean addEmployee(Employees e, int i) {
		if (i < 0 || i > number.length)
			return false;
		if (number[i] != null)
			return false;
		else
			number[i] = e;
		return true;
	}

	// Method to remove an employee from performance
//	public void removeEmployee(Employee z) {
//		for (int i = 0; i < broj.length; i++) {
//			if (broj[i] != null) {
//				if (broj[i] == z) {
//					broj[i] = null;
//				}
//			}
//		}
//	}

	// Getters
	public String getPerformanceTitle() {
		return performanceTitle;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public int getNumberOfEmployees() {
		return this.number.length;
	}

	//Print 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.performanceTitle).append(", ");
		sb.append(theatre.name).append("\n");
		for (int i = 0; i < number.length; i++) {
			if (number[i] != null) {
				sb.append(number[i]);

			}

		}
		return sb.toString();
	}
}