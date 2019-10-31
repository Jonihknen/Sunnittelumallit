package tehtävä4;

import java.io.IOException;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
	
	ClockTimer clock = new ClockTimer();
	@Override
	public void run() {
		while(true) {
			String response = clock.getTime();
			setChanged();
			notifyObservers(response);
			try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
			clock.addSecond();
		}
	}

}
