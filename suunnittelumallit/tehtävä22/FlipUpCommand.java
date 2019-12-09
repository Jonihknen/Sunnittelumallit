package tehtävä22;

public class FlipUpCommand implements Command {
	
	private Kangas kangas;
	
	public FlipUpCommand(Kangas kangas) {
		this.kangas = kangas;
	}

	public void execute() {
		kangas.nosta();
	}
}