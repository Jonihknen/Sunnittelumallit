package tehtävä22;

public class Kytkin {
	
	Command cmd;

	public Kytkin(Command command){
	cmd = command;
	}
	
	public void push() {
		cmd.execute();
	}
}