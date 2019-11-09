package Tehtävä6;

public class Banaani extends Täytteet{

	public Banaani(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void decorate() {
		super.decorate();
		addBanaani(pizza);
	}
	
	private void addBanaani(Pizza pizza) {
		System.out.println(" + banaani ");
	}

	@Override
	public String getDescription() {
		return super.getDescription()  + " + banaani ";
	}
	public double getHinta() {
		return super.getHinta() + 2.3;
	}
	
}
