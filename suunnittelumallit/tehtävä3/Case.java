package tehtävä3;

import java.util.ArrayList;
import java.util.List;

public class Case implements Component {
	
	private int kokohinta = 0;
	private int hinta = 70;
	
	List<Component> componentList = new ArrayList<Component>();
	
	@Override
	public void addComponent(Component component) {
		componentList.add(component);

	}

	@Override
	public int getPrice() {
		System.out.println("Case: 70e");
		for (Component c : componentList) {
			kokohinta = this.kokohinta+c.getPrice();
			
		}
		kokohinta = kokohinta+hinta;
		return kokohinta;
		
	}

}
