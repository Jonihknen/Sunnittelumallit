package tehtävä21;

import java.util.Random;

class Aamupala {
	
	Random rand = new Random();
	int randomNum = rand.nextInt((4 - 2) + 1) + 2;
	
    public void syö(String ruoka) {  
    	System.out.println("Syö " + ruoka);
    }
    
    public void juo() { 
    	System.out.println("Juo " + randomNum + " kuppia kahvia");
    }
    

}