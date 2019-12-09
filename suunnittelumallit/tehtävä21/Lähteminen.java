package tehtävä21;

import java.util.Random;

class Lähteminen {
	
	public void peseHampaat() {
		System.out.println("hampaat pesty");
	}
	
	
    public void lähde() {
    	Random random = new Random();
        if(random.nextBoolean()) {
        	System.out.println("lähde bussipysäkille");
        }else {
        	System.out.println("luovuta ja mene takaisin nukkumaan");
        }
	}
    
}
