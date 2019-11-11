package tehtävä7;


public class Charmeleon extends EvolveState{

	private static Charmeleon INSTANCE = null;
	
	public static Charmeleon getInstance() { 
        if (INSTANCE == null) {
            INSTANCE = new Charmeleon();
        }
        return INSTANCE; 
    } 
	
	public void activeCharizard(FireStarter f) {
		System.out.println("\n>>>>>>>>>evolved to biggest boi charizard<<<<<<<<<\n");
		changeEvolve(f, Charizard.getInstance());
	}
	
	
	public void kerronimi(FireStarter f) {
		System.out.println("heihei nimeni on charmeleon");
	}
	public void kierrepotku(FireStarter f) {
		System.out.println("kierrepotku");
	}
	public void lennä(FireStarter f) {
		System.out.println("pikkulento");
		activeCharizard(f);
	}
}
