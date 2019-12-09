package tehtävä21;

class Herätyskello {
	
	
    public void hipaise(double aika) { 
    	while(aika < 8.40) {
    		System.out.println("torkuta 5min");
    		aika=aika+0.05;
    	} 
    	System.out.println("sammuta herätyskello");
    	
    }
}