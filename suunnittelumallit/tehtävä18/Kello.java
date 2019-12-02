package tehtävä18;

public class Kello implements Cloneable{
	
	String aika;
	private Pikkuviisari pikkuviisari;
	private Isoviisari isoviisari;
	
	public Kello(int t1, int t2) {
		isoviisari = new Isoviisari(t1);
		pikkuviisari = new Pikkuviisari(t2);
	}
	public String getAika() {
		aika = "Kello on " + String.valueOf(isoviisari.getAika() + ":" + String.valueOf(pikkuviisari.getAika()));
		return aika;
	}
	public void setAika(int tunnit, int minuutit) {
		isoviisari.setAika(tunnit);
		pikkuviisari.setAika(minuutit);
	}
	public Kello clone() throws CloneNotSupportedException{
		Kello kello = null;
		kello = (Kello)super.clone();
		kello.pikkuviisari = (Pikkuviisari)pikkuviisari.clone();
		kello.isoviisari = (Isoviisari)isoviisari.clone();
		return kello;
		}

}
	
