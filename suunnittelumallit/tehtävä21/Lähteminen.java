package teht�v�21;

import java.util.Random;

class L�hteminen {
	
	public void peseHampaat() {
		System.out.println("hampaat pesty");
	}
	
	
    public void l�hde() {
    	Random random = new Random();
        if(random.nextBoolean()) {
        	System.out.println("l�hde bussipys�kille");
        }else {
        	System.out.println("luovuta ja mene takaisin nukkumaan");
        }
	}
    
}
