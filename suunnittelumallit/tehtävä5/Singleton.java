package tehtävä5;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Singleton { 

    private static Singleton INSTANCE = null; 
    public String aika; 
  

    private Singleton() { 
        aika = getTime();
    } 
  
    public static Singleton getInstance() { 
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE; 
    } 
    
    
    
    
	LocalTime time = LocalTime.now();
	
	int tunnit = time.getHour();
	int minuutit = time.getMinute();
	int sekunnit = time.getSecond();
	
	Format f = new SimpleDateFormat("HH.mm.ss Z");
	
	public void addTime() {
		tunnit++;
	}
	

	public String getTime() {
		return String.format("%02d", this.tunnit)
				+ ":" + String.format("%02d", this.minuutit) 
					+ ":" + String.format("%02d", this.sekunnit);
		
	}
} 
