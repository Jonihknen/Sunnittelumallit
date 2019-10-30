package tehtävä3;

public class Ram implements Component {

	private int hinta = 55;
	
	@Override
	public void addComponent(Component component) {
		throw new RuntimeException
		("Cannot add a components to this component ...");

	}

	@Override
	public int getPrice() {
		System.out.println("Ram: 55e");
		return hinta;
		
	}

}
