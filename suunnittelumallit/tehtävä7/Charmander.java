package tehtävä7;


public class Charmander extends EvolveState{

	private static Charmander INSTANCE = null;
	
	public static Charmander getInstance() { 
        if (INSTANCE == null) {
            INSTANCE = new Charmander();
        }
        return INSTANCE; 
    } 
	
	public void activeCharmeleon(FireStarter f) {
		System.out.println("\n>>>>>>>>>>evolved to big boi charmeleon<<<<<<<<<<<<\n");
		changeEvolve(f, Charmeleon.getInstance());
	}
	
	
	public void kerronimi(FireStarter f) {
		System.out.println("heihei nimeni on charmander");
	}
	public void kierrepotku(FireStarter f) {
		System.out.println("minipotku");
	}
	public void lennä(FireStarter f) {
		System.out.println("en lennä");
		activeCharmeleon(f);
	}
}
