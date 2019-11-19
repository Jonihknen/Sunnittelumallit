package tehtävä11;
import java.util.Random;

public class NumeroKone {
	
	private int numero;
	Random rand = new Random();
	
	public NumeroKone() {
		this.numero = rand.nextInt((10 - 1) + 1) + 1;
	}
	

	
	public Memento getNumero() {
		return new Memento(this.numero);
	}
	
	public String tarkistaNumero(Object obj, int arvaus) {
		boolean xoxo = false;
		Memento memento = (Memento) obj;
		if (memento.getState() == arvaus) {
		this.numero = memento.getState();
		xoxo = true;

		} else {

		}
		if (xoxo == true) {
			
		return String.valueOf(this.numero);
		}
		return "";
	}
	
	private class Memento {
		private int numero;
		
		public Memento(int numero) {
			this.numero=numero;
		}
		
		public int getState() {
			return this.numero;
		}
	}
	
	
	
}
