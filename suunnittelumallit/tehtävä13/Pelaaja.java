package tehtävä13;

public abstract class Pelaaja {

	private String nimi;
	private int xp;
	private int level;
	
	protected Pelaaja(String nimi) {
		this.nimi = nimi;
	}
	
	public String getNimi() {
		return nimi;
	}
	public int getXp() {
		return xp;
	}
	
	public abstract void accept(Visitor visitor);
	

	
}
