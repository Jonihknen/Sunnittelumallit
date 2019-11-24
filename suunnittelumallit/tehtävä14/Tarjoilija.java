package tehtävä14;

public class Tarjoilija {

	private HampurilaisenKasaaja kasaaja;
	
	public void setKasaaja(HampurilaisenKasaaja hampurilaisenkasaaja) {
		kasaaja = hampurilaisenkasaaja;
	}
	public Hampurilainen getHampurilainen() {
		return kasaaja.getHampurilainen();
	}
	public void kasaaHampurilainen() {
		kasaaja.createHampurilainen();
		kasaaja.createJuusto();
		kasaaja.createLeivät();
		kasaaja.createPihvi();
	}
}
