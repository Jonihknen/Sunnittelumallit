package tehtävä3;

public class Cpu implements Component {

	private int hinta = 255;
	
	@Override
	public void addComponent(Component component) {
		throw new RuntimeException
		("Cannot add a components to this component ...");


	}

	@Override
	public int getPrice() {
		System.out.println("Cpu: 255e");
		return hinta;
		
	}

}
