package tehtävä2b;

public class Bosstehdas extends AbstractFactory {
	   @Override
	   public Vaate getVaate(String vaate){    
	      if(vaate.equalsIgnoreCase("LIPPIS")){
	         return new Blippis();         
	      }else if(vaate.equalsIgnoreCase("FARKUT")){
	         return new Bfarkut();
	      }else if(vaate.equalsIgnoreCase("PAITA")){
		     return new Btpaita();
		  }else if(vaate.equalsIgnoreCase("KENGÄT")){
		     return new Bkengät();
		  }	 	 
	      return null;
	   }


	}