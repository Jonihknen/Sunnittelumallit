package tehtävä9;

import java.util.List;

public class Valitsin {
	
	private ListConverter converter;
	
	public void setConverter(ListConverter converter) {
		this.converter = converter;
	}
	
	public String printmylist(List<String> list) {
		return converter.listToString(list);
		
	}

}
