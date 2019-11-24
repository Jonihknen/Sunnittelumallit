package tehtävä14;

public class Hampurilainen {

	private String juusto = "";
	private String leivät = "";
	private String pihvi = "";
	
	public void setJuusto(String juusto) {
		this.juusto = juusto;
	}
	public void setLeivät(String leivät) {
		this.leivät = leivät;
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
	public String getLeivät() {
		return leivät;
	}
	public String asd() {
		String a = getLeivät() + " " + getJuusto() + " " + getPihvi();
		return a;
		
	}
}
