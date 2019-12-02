package tehtävä20;

import java.io.*; 
import java.util.*; 

public class Main implements Runnable{

	
	public static void main(String[] args)  { 
		
		Thread t1 = new Thread(new Main ());
		Thread t2 = new Thread(new Main ());
		t1.start();
		t2.start();
       
    }

	@Override
	public void run() {
		ArrayList<String> list = new ArrayList<String>(); 
		  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
  
        Iterator<String> iterator = list.iterator(); 
  
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); 
        }
	}
		
	
} 
