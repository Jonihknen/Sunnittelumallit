package teht�v�7;

public abstract class EvolveState {
	void activeCharmander(FireStarter f) {}
	void activeCharmeleon(FireStarter f) {}
	void activeCharizard(FireStarter f) {}
	
	
	public void kierrepotku(FireStarter f) {}
	public void lenn�(FireStarter f) {}
	public void kerronimi(FireStarter f) {}
	
	void changeEvolve(FireStarter f, EvolveState e) {
		f.changeEvolve(e);
	}
}
