package tehtävä2;

public class Main {
	
	public static void main(String[] args) {
		
		String status = "oppilas";
		
		AbstractFactory tehdas = Factoryproducer.getFactory(status);
		
		Vaate housut = tehdas.getVaate("farkut");
		Vaate lippis = tehdas.getVaate("lippis");
		Vaate kengät = tehdas.getVaate("kengät");
		Vaate paita = tehdas.getVaate("paita");
		System.out.println("Jasperi pukee " + housut);
		System.out.println("Jasperi pukee " + paita);
		System.out.println("Jasperi pukee " + kengät);
		System.out.println("Jasperi pukee " + lippis);
	}

}
