package tehtävä3;

public class Gpu implements Component {

	private int hinta = 175;
	
	@Override
	public void addComponent(Component component) {
		throw new RuntimeException
		("Cannot add a components to this component ...");
		
	}

	@Override
	public int getPrice() {
		System.out.println("gpu: 175e");
		return hinta;
		
	}

}
