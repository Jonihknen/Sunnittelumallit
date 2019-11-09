package Tehtävä6;

public class Ananas extends Täytteet{

	public Ananas(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void decorate() {
		super.decorate();
		addAnanas(pizza);
	}
	
	private void addAnanas(Pizza pizza) {
		System.out.println(" + ananas ");
	}

	@Override
	public String getDescription() {
		return super.getDescription()  + " + ananas ";
	}
	public double getHinta() {
		return super.getHinta() + 1.5;
	}
	
}
