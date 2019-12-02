package tehtävä18;

public class Isoviisari implements Cloneable{

	private int aika;
	
	public int getAika() {
		return aika;
	}
	public void setAika(int aika) {
		this.aika = aika;
	}
	
	public Isoviisari(int aika) {
		this.aika = aika;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		}

	
}
