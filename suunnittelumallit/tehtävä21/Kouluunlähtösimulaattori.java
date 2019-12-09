package tehtävä21;

class Kouluunlähtösimulaattori {

	private final Aamupala aamupala;
    private final Herätyskello herätyskello;
    private final Lähteminen lähtö;

    public Kouluunlähtösimulaattori() {
        this.aamupala = new Aamupala();
        this.herätyskello = new Herätyskello();
        this.lähtö = new Lähteminen();
    }

    public void letsgo(double aika) {
    	herätyskello.hipaise(aika);
        aamupala.syö("banaani");
        aamupala.juo();
        lähtö.peseHampaat();
        lähtö.lähde();
    }
}