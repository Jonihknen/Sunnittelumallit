package Tehtävä6;

public class Pizzapohja implements Pizza{
	
	int hinta = 3;

	@Override
	public void decorate() {
		System.out.println("pizza pohja");
	}

	public double getHinta() {
		return hinta;
	}

	@Override
	public String getDescription() {
		return "pizzapohja ";
	}

	
}
