package Tehtävä6;

public class Main {

	public static void main(String[] args) {
		
		
		Pizza testipizza1 = new Kinkku(new Juusto(new Ananas(new Pizzapohja())));
		Pizza testipizza2 = new Banaani(new Juusto(new Pekoni(new Pizzapohja())));
		Pizza testipizza3 = new Pekoni(new Pekoni(new Banaani(new Pizzapohja())));
		
		
		
		
		System.out.println(testipizza1.getDescription());
		System.out.println("pizzan hinta " + testipizza1.getHinta() + "e\n");
		
		System.out.println(testipizza2.getDescription());
		System.out.println("pizzan hinta " + testipizza2.getHinta() + "e\n");
		
		System.out.println(testipizza3.getDescription());
		System.out.println("pizzan hinta " + testipizza3.getHinta() + "e");
		

	}

}
