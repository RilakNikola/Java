package testt;

public class Actor extends Employees {

	
	public Actor(String name, Theatre theatre) {
		super(name, theatre);
	}

	public char jobTag() {
		return 'A';
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
