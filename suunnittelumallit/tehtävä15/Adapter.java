package tehtävä15;

public class Adapter implements US{

	private EU eu;

	public Adapter(EU eu) {
		this.eu = eu;
	}
	
	@Override
	public double value() {
		
		double tulos = eu.value() * 1.10218;
		
		return tulos;
	}

}
