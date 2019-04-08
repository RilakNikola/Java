package testt;

public class CostumeDesigner extends Employees {

	public CostumeDesigner(String name, Theatre theatre) {
		super(name, theatre);
	}

	public char jobTag() {
		return 'C';
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
