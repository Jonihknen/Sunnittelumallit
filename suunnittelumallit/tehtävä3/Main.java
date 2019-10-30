package tehtävä3;

public class Main {

	public static void main(String[] args) {
		
		Ram ram = new Ram();
		Nic nic = new Nic();
		Gpu gpu = new Gpu();
		Case xase = new Case();
		Cpu cpu = new Cpu();
		Nic nic2 = new Nic();
		
		
	
		Motherboard mboard = new Motherboard();
		mboard.addComponent(ram);
		mboard.addComponent(nic);
		mboard.addComponent(gpu);
		mboard.addComponent(cpu);
		
		xase.addComponent(mboard);
		xase.addComponent(nic2);
		
		int hinta = xase.getPrice();
		
		System.out.println();
		
		System.out.println("paketin kokonaishinta on: " + hinta + "e.");
		

		
	
	}
	
}
