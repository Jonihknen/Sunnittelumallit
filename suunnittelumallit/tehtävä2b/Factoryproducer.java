package teht�v�2b;

public class Factoryproducer {
	   public static AbstractFactory getFactory(String status){   
	      if(status == "opiskelija"){
	         return new Adidastehdas();         
	      }else if(status == "insin��ri"){
	         return new Bosstehdas();
	      }
	      return null;
	   }
	}