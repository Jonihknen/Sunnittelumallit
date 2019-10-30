package tehtävä3;

public class Nic implements Component {

	private int hinta = 35;
	
	@Override
	public void addComponent(Component component) {
		throw new RuntimeException
		("Cannot add a components to this component ...");

	}

	@Override
	public int getPrice() {
		System.out.println("Network interface controller: 35e");
		return hinta;
		
	}
	
	public void getName() {
		System.out.println("Network interface controller: 35e");
	}

}
