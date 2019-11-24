package teht�v�13;

public class Charmander extends Pelaaja{
	
	String nimi;
	private int xp = 0;
	
	protected Charmander(String nimi) {
		super(nimi);
		this.nimi = nimi;
	}
	
	public void accept(Visitor visitor) {
		Visitor.visit(this);
	}
	public int getXp() {
		return xp;	
	}
	public int setXp(int xp) {
		this.xp = xp;
		return xp;
	}
	public String getNimi() {
		return nimi;
	}

}
