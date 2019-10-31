package tehtävä4;

import java.util.Observable;
import java.util.Observer;

public class MyApp {
	public static void main (String[] args) {
		System.out.println("enter text >");
		EventSource eventsource = new EventSource();
		eventsource.addObserver(new Observer() {
			public void update(Observable obj, Object arg){
				System.out.println("Kello on : " + arg);
			}
		});
		
		//toinen kello viereen pyörimään
		Opserveri opserver = new Opserveri();
		eventsource.addObserver(opserver);
		
		new Thread(eventsource).start();
	}

}
