package testt;

public class Theatre {

	private static int uid = 0;
	private int id;
	protected String name;

	// Constructor
	public Theatre(String name) {
		this.name = name;
		this.id = ++uid;
	}

	// Getters for ID and name
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Print in form "name[id]"
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName()).append("[").append(this.getId()).append("]");
		return sb.toString();
	}

//	public String toString() {
//		return this.getNaziv()+"["+this.getId()+"].";
//	}
}

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

package testt;

public class Main {

	public static void main(String[] args) {
		Theatre t1 = new Theatre("London Theatre");
		Theatre t2 = new Theatre("Teatar on the hill");
		Employees e1 = new Actor ("George Clooney", t1);
		Employees e2 = new CostumeDesigner ("Marc Peters", t1);
		Employees e3 = new Director ("Quentin Tarantino", t1);
		Employees e4 = new Actor ("Brad Pitt", t2);
		Employees e5 = new CostumeDesigner ("Harold Marshall", t2);
		Employees e6 = new Director ("Stacey Lopez", t2);
		Employees e7 = new Actor ("Kelsie Moore", t2);
		Employees e8 = new Director ("Sarah Kordos", t2);
		Employees e9 = new CostumeDesigner ("Vanessa Reed", t2);



		
		Performance pr1 = new Performance("Karmen", t2, 10);
		Performance pr2 = new Performance("Show time", t2, 10);
		
		pr1.addEmployee(e1, 1);
		pr1.addEmployee(e2, 2);
		pr1.addEmployee(e3, 3);
		
		
		pr2.addEmployee(e5, 1);
		pr2.addEmployee(e6, 2);
		pr2.addEmployee(e7, 3);
		pr2.addEmployee(e8, 4);
		pr2.addEmployee(e9, 5);
		pr2.addEmployee(e4, 5);
		
		
		
		System.out.println(pr1);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(e1);
		System.out.println(pr2);
		
		
		
		

	}

}
