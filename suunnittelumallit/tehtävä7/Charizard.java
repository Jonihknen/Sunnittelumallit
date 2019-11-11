package tehtävä7;


public class Charizard extends EvolveState{

	private static Charizard INSTANCE = null;
	
	public static Charizard getInstance() { 
        if (INSTANCE == null) {
            INSTANCE = new Charizard();
        }
        return INSTANCE; 
    } 
	
	public void activeCharmander(FireStarter f) {
		System.out.println("\npitänee hankkia uusi\n");
		changeEvolve(f, Charmander.getInstance());
	}
	
	public void kerronimi(FireStarter f) {
		System.out.println("heihei nimeni on charizard");
	}
	public void kierrepotku(FireStarter f) {
		System.out.println("gigapotku");
	}
	public void lennä(FireStarter f) {
		System.out.println("sinne meni osteri ossi");
		activeCharmander(f);
	}
	
}
