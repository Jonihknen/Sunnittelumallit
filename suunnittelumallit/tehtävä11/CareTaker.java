package teht‰v‰11;

public class CareTaker {

	private Object obj;
	
	public void save(NumeroKone numerokone) {
		this.obj = numerokone.getNumero();
	}
	public boolean tarkista(NumeroKone numerokone, int arvaus) {
		String kek = numerokone.tarkistaNumero(obj, arvaus);
		boolean xoxo = false;
		if (kek.equals("")) {
			System.out.println("v‰‰r‰ arvaus " + kek);
		} else {
			xoxo = true;
		System.out.println("oikea arvaus " + kek);
		}
		return xoxo;
	}
}
