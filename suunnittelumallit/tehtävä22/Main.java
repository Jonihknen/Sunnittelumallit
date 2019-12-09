package tehtävä22;

public class Main{
public static void main(String[] args){
	
	Kangas kangas = new Kangas();
	Command switchUp = new FlipUpCommand(kangas);
	Command switchDown = new FlipDownCommand(kangas);
	Kytkin button1 = new Kytkin(switchUp);
	Kytkin button2 = new Kytkin(switchDown);
	
	button1.push();
	button2.push();
	}
}