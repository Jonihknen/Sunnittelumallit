package teht�v�2;

public class Adidastehdas extends AbstractFactory {
	   @Override
	   public Vaate getVaate(String vaate){    
	      if(vaate.equalsIgnoreCase("LIPPIS")){
	         return new Alippis();         
	      }else if(vaate.equalsIgnoreCase("FARKUT")){
	         return new Afarkut();
	      }else if(vaate.equalsIgnoreCase("PAITA")){
		     return new Atpaita();
		  }else if(vaate.equalsIgnoreCase("KENG�T")){
		     return new Akeng�t();
		  }	 	 
	      return null;
	   }


	}