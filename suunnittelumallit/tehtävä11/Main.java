package tehtävä11;

public class Main implements Runnable{
	
	Thread t;

	public static void main(String[] args) {
		
		Main ix = new Main();
		Thread t1 = new Thread(ix, "asd");
		Thread t2 = new Thread(ix, "lel");
		Thread t3 = new Thread(ix, "ldl");
		t1.start();
		t2.start();
		t3.start();

	}
	@Override
	public void run() {
		CareTaker caretaker = new CareTaker();
		NumeroKone numerokone = new NumeroKone();
		caretaker.save(numerokone);
		boolean x = false;
		int i = 1;

		
		while (x == false) {
		x = caretaker.tarkista(numerokone, i);
		i++;
		}
		
	}




}
