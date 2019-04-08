package testt;

public class Director extends Employees {

	public Director(String name, Theatre theatre) {
		super(name, theatre);
	}

	public char jobTag() {
		return 'D';
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
