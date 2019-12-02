package tehtävä18;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {


		Kello kellokellonen = new Kello(20,45);
		System.out.println("1 " + kellokellonen.getAika());
		
		Kello kellokakkonen = kellokellonen.clone();
		System.out.println("2 " + kellokakkonen.getAika() + "\n");
		
		kellokellonen.setAika(15, 55);
		
		System.out.println("1 " + kellokellonen.getAika());
		System.out.println("2 " + kellokakkonen.getAika() + "\n");
		
		kellokakkonen.setAika(13, 37);
		
		System.out.println("1 " + kellokellonen.getAika());
		System.out.println("2 " + kellokakkonen.getAika());
		
		

	}

}
