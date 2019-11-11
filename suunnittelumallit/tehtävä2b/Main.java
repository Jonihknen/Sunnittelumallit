package tehtävä2b;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
	
	public static void main(String[] args) {
		
		String tehras = "adidastehdas";
		
		Class<?> c = null;
		AbstractFactory tehdas = null;
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("src/tehtävä2b/properties"));
		}catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty(tehras));
			tehdas = (AbstractFactory)c.newInstance();
		}catch (Exception e) {
			e.printStackTrace();
		}
		

		
		
		
		
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
