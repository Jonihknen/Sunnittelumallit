package teht�v�15;

public class Main {
	
	
	// yksinkertainen valuuttamuunnin k�ytt�en adapteria

	public static void main(String[] args) {
		
		EU kolikko = new Raha();
		US adapter = new Adapter(kolikko);
		
		System.out.println(kolikko.value() + " euroa vastaa "  + adapter.value() + " US dollaria");

	}

}
