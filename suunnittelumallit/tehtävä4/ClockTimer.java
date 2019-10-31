package tehtävä4;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class ClockTimer{


	LocalTime time = LocalTime.now();
	
	int tunnit = time.getHour();
	int minuutit = time.getMinute();
	int sekunnit = time.getSecond();
	
	Format f = new SimpleDateFormat("HH.mm.ss Z");
	

	public String getTime() {
		return String.format("%02d", this.tunnit)
				+ ":" + String.format("%02d", this.minuutit) 
					+ ":" + String.format("%02d", this.sekunnit);
		
	}

	public void addSecond() {
		this.sekunnit++;
		if (sekunnit == 60) {
			minuutit++;
			sekunnit = 0;
			if (minuutit == 60) {
				tunnit++;
				minuutit = 0;
			}
		}
	}
}

