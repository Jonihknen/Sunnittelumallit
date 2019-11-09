package Tehtävä6;

public class Kinkku extends Täytteet{

	public Kinkku(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void decorate() {
		super.decorate();
		addKinkku(pizza);
	}
	
	private void addKinkku(Pizza pizza) {
		System.out.println(" + kinkku ");
	}

	@Override
	public String getDescription() {
		return super.getDescription()  + " + kinkku ";
	}
	public double getHinta() {
		return super.getHinta() + 2;
	}
	
}
