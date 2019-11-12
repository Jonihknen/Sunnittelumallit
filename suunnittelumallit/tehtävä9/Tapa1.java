package tehtävä9;

import java.util.Iterator;
import java.util.List;

public class Tapa1 implements ListConverter{

	private String palautus = "";
	
	public String listToString(List<String> list) {
		
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			palautus = palautus + iterator.next() + "\n";
		}
		

		return palautus;
		
	}
}
