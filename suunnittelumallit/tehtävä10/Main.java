package tehtävä10;

public class Main {

	public static void main(String[] args) {
		Lähiesimies matti = new Lähiesimies();
		Päällikkö teppo= new Päällikkö();
		Toimitusjohtaja seppo = new Toimitusjohtaja();
		
		matti.setSuccessor(teppo);
		teppo.setSuccessor(seppo);
		
		System.out.println("Saispa enemmän palkkaa");
		matti.process(20);
		
		System.out.println("koitetaanpa uudestaan onnea");
		matti.process(100);
		
		System.out.println("koitetaanpa uudestaan onnea");
		matti.process(300);
		
		System.out.println("koitetaanpa uudestaan onnea");
		matti.process(1000);

	}

}
