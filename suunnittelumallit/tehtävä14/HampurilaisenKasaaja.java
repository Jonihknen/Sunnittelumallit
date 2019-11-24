package tehtävä14;

public abstract class HampurilaisenKasaaja {

	protected Hampurilainen hampurilainen;
	
	public Hampurilainen getHampurilainen() {
		return hampurilainen;
	}
	public void createHampurilainen() {
		hampurilainen = new Hampurilainen();
	}
	public abstract void createJuusto();
	public abstract void createPihvi();
	public abstract void createLeivät();
}
