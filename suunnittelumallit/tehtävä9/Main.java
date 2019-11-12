package tehtävä9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		String[] listitems = { "1","2","3","4","5","6","7","8","9","10" };
		list.addAll(Arrays.asList(listitems));
		
		Valitsin valitsin = new Valitsin();
		
		valitsin.setConverter(new Tapa1());
		System.out.println(valitsin.printmylist(list));
		valitsin.setConverter(new Tapa2());
		System.out.println(valitsin.printmylist(list));
		valitsin.setConverter(new Tapa3());
		System.out.println(valitsin.printmylist(list));
		
	}

}
