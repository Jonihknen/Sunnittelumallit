package teht�v�7;

public class FireStarter {
	
	private EvolveState evolve;


	public FireStarter(){
	this.evolve = Charmander.getInstance();
	}
	
	public void activeCharmeleon() {
		evolve.activeCharmeleon(this);
		}
	public void activeCharizard() {
		evolve.activeCharizard(this);
		}
	public void activeCharmander() {
		evolve.activeCharmander(this);
		}
	public void kierrepotku() {
		evolve.kierrepotku(this);
	}
	public void kerronimi() {
		evolve.kerronimi(this);
	}
	public void lenn�() {
		evolve.lenn�(this);
	}

	protected void changeEvolve(EvolveState e) {
		this.evolve = e;
	}
	
}