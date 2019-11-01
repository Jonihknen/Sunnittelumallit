package tehtävä5;

//Erittäinkin hyödyllinen ratkaisu laiskalle henkilölle kellojen kesäaikaan siirtämiseen.
//Siirrä vessan kello niin muut kellot tulevat mukana

public class Main { 
    public static void main(String args[]) 
    { 

        Singleton vessankello = Singleton.getInstance(); 
        Singleton keittiönkello = Singleton.getInstance(); 
        Singleton rannekello = Singleton.getInstance(); 
        
        System.out.println("vessankello näyttää " + vessankello.aika); 
        System.out.println("keittiönkello näyttää " + keittiönkello.aika); 
        System.out.println("rannekello näyttää " + rannekello.aika); 
        System.out.println("\n"); 

        vessankello.addTime();
        keittiönkello.aika = keittiönkello.getTime();
  
        System.out.println("vessankello näyttää " + vessankello.aika); 
        System.out.println("keittiönkello näyttää " + keittiönkello.aika); 
        System.out.println("rannekello näyttää " + rannekello.aika); 
  
    } 
} 