package teht�v�14;

public class Hampurilainen {

	private String juusto = "";
	private String leiv�t = "";
	private String pihvi = "";
	
	public void setJuusto(String juusto) {
		this.juusto = juusto;
	}
	public void setLeiv�t(String leiv�t) {
		this.leiv�t = leiv�t;
	}
	public void setPihvi(String pihvi) {
		this.pihvi = pihvi;
	}
	public String getPihvi() {
		return pihvi;
	}
	public String getJuusto() {
		return juusto;
	}
	public String getLeiv�t() {
		return leiv�t;
	}
	public String asd() {
		String a = getLeiv�t() + " " + getJuusto() + " " + getPihvi();
		return a;
		
	}
}
