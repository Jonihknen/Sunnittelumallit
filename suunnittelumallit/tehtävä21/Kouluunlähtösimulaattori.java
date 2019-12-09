package teht�v�21;

class Kouluunl�ht�simulaattori {

	private final Aamupala aamupala;
    private final Her�tyskello her�tyskello;
    private final L�hteminen l�ht�;

    public Kouluunl�ht�simulaattori() {
        this.aamupala = new Aamupala();
        this.her�tyskello = new Her�tyskello();
        this.l�ht� = new L�hteminen();
    }

    public void letsgo(double aika) {
    	her�tyskello.hipaise(aika);
        aamupala.sy�("banaani");
        aamupala.juo();
        l�ht�.peseHampaat();
        l�ht�.l�hde();
    }
}