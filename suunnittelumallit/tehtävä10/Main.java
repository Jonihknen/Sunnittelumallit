package teht�v�10;

public class Main {

	public static void main(String[] args) {
		L�hiesimies matti = new L�hiesimies();
		P��llikk� teppo= new P��llikk�();
		Toimitusjohtaja seppo = new Toimitusjohtaja();
		
		matti.setSuccessor(teppo);
		teppo.setSuccessor(seppo);
		
		System.out.println("Saispa enemm�n palkkaa");
		matti.process(20);
		
		System.out.println("koitetaanpa uudestaan onnea");
		matti.process(100);
		
		System.out.println("koitetaanpa uudestaan onnea");
		matti.process(300);
		
		System.out.println("koitetaanpa uudestaan onnea");
		matti.process(1000);

	}

}
