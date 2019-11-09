package Tehtävä6;

public class Juusto extends Täytteet{

	public Juusto(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public void decorate() {
		super.decorate();
		addJuusto(pizza);
	}
	
	private void addJuusto(Pizza pizza) {
		System.out.println(" + juusto ");
	}

	@Override
	public String getDescription() {
		return super.getDescription()  + " + juusto ";
	}
	public double getHinta() {
		return super.getHinta() + 2.5;
	}
	
}
