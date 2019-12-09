package tehtävä22;

public class FlipDownCommand implements Command {
	
	private Kangas kangas;
	
	public FlipDownCommand(Kangas kangas) {
		this.kangas = kangas;
	}
	
	public void execute() {
		kangas.laske();
	}
}