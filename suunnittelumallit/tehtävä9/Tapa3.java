package tehtävä9;

import java.util.List;

public class Tapa3 implements ListConverter{

	public String listToString(List<String> list) {
		
		StringBuilder sb = new StringBuilder();
	
		int i = 0;
		for (String ch : list) { 
            sb.append(ch + " "); 
            i++;
            if (i == 3) {
            	sb.append("\n");
            	i = 0;
            }
        }
		
		String string = sb.toString();
		return string;
		
	}
}
