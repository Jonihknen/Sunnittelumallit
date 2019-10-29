package tehtävä2;

public class Adidastehdas extends AbstractFactory {
	   @Override
	   public Vaate getVaate(String vaate){    
	      if(vaate.equalsIgnoreCase("LIPPIS")){
	         return new Alippis();         
	      }else if(vaate.equalsIgnoreCase("FARKUT")){
	         return new Afarkut();
	      }else if(vaate.equalsIgnoreCase("PAITA")){
		     return new Atpaita();
		  }else if(vaate.equalsIgnoreCase("KENGÄT")){
		     return new Akengät();
		  }	 	 
	      return null;
	   }


	}