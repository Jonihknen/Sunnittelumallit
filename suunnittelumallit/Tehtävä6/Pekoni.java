package Tehtävä6;

public class Pekoni extends Täytteet{

	public Pekoni(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void decorate() {
		super.decorate();
		addPekoni(pizza);
	}
	
	private void addPekoni(Pizza pizza) {
		System.out.println(" + pekoni ");
	}

	@Override
	public String getDescription() {
		return super.getDescription()  + " + pekoni ";
	}
	public double getHinta() {
		return super.getHinta() + 2.2;
	}
	
}
