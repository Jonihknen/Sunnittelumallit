package tehtävä13;

public class Main {

	public static void main(String[] args) {

		Leveler leveler = new Leveler();
		
		for(int x = 0; x<10; x++) {
		leveler.fight();
		System.out.println();
		}
	}

}
