package teht�v�5;

//Eritt�inkin hy�dyllinen ratkaisu laiskalle henkil�lle kellojen kes�aikaan siirt�miseen.
//Siirr� vessan kello niin muut kellot tulevat mukana

public class Main { 
    public static void main(String args[]) 
    { 

        Singleton vessankello = Singleton.getInstance(); 
        Singleton keitti�nkello = Singleton.getInstance(); 
        Singleton rannekello = Singleton.getInstance(); 
        
        System.out.println("vessankello n�ytt�� " + vessankello.aika); 
        System.out.println("keitti�nkello n�ytt�� " + keitti�nkello.aika); 
        System.out.println("rannekello n�ytt�� " + rannekello.aika); 
        System.out.println("\n"); 

        vessankello.addTime();
        keitti�nkello.aika = keitti�nkello.getTime();
  
        System.out.println("vessankello n�ytt�� " + vessankello.aika); 
        System.out.println("keitti�nkello n�ytt�� " + keitti�nkello.aika); 
        System.out.println("rannekello n�ytt�� " + rannekello.aika); 
  
    } 
} 