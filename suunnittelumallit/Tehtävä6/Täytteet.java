package Tehtävä6;

public abstract class Täytteet implements Pizza {

	protected Pizza pizza;
	
	public Täytteet(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public void decorate() {
		pizza.decorate();
	}
	public String getDescription() {
		return pizza.getDescription();
	}

	public double getHinta() {
		return pizza.getHinta();
	}
}
