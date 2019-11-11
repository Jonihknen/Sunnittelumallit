package tehtävä2b;

public class Factoryproducer {
	   public static AbstractFactory getFactory(String status){   
	      if(status == "opiskelija"){
	         return new Adidastehdas();         
	      }else if(status == "insinööri"){
	         return new Bosstehdas();
	      }
	      return null;
	   }
	}