package teht�v�22;

public class Kytkin {
	
	Command cmd;

	public Kytkin(Command command){
	cmd = command;
	}
	
	public void push() {
		cmd.execute();
	}
}