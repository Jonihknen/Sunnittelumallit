package teht‰v‰10;

public abstract class Palkankorotus {
	
	protected int palkka = 4020;
	protected Palkankorotus successor;

	public void setSuccessor(Palkankorotus successor) {
		this.successor = successor;
	}
	
	abstract public void process(int m‰‰r‰);
	
}
