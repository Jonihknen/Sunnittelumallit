package teht�v�2;

public class Main {
	
	public static void main(String[] args) {
		
		String status = "oppilas";
		
		AbstractFactory tehdas = Factoryproducer.getFactory(status);
		
		Vaate housut = tehdas.getVaate("farkut");
		Vaate lippis = tehdas.getVaate("lippis");
		Vaate keng�t = tehdas.getVaate("keng�t");
		Vaate paita = tehdas.getVaate("paita");
		System.out.println("Jasperi pukee " + housut);
		System.out.println("Jasperi pukee " + paita);
		System.out.println("Jasperi pukee " + keng�t);
		System.out.println("Jasperi pukee " + lippis);
	}

}
