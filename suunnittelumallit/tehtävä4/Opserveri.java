package tehtävä4;

import java.util.Observable;
import java.util.Observer;

public class Opserveri implements Observer {

	public void update(Observable obj, Object arg){
		System.out.println("\nKello on : " + arg);
	}
}
