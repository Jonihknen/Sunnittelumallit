package tehtävä18;

public class Pikkuviisari implements Cloneable{

	private int aika;
	
	public int getAika() {
		return aika;
	}
	public void setAika(int aika) {
		this.aika = aika;
	}
	
	public Pikkuviisari(int aika) {
		this.aika = aika;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		}

	
}
