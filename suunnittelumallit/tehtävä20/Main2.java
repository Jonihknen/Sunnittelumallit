package tehtävä20;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
	
	public static void main(String[] args)  { 
		
		ArrayList<String> list = new ArrayList<String>(); 
		  
        list.add("A"); 
        list.add("B"); 
        list.add("C"); 
        list.add("D"); 
        list.add("E"); 
  
        Iterator<String> iterator = list.iterator(); 
  
  
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); 
//        	if(list.size() < 8) {
        	list.add("newitem");
        }
	}

}
