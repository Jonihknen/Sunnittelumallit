package tehtävä9;

import java.util.List;

public class Tapa2 implements ListConverter{

	String palautus = "";
	
	public String listToString(List<String> list) {
		
		for (int i = 0; i<list.size(); i++) {
			String wtf = (list.get(i));
			palautus = palautus + " " + wtf;
			if(i % 2 == 1) {
				palautus = palautus + "\n";
			}
		}
		return palautus;
		
	}
}
