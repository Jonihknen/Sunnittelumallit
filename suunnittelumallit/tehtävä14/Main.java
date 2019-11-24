package teht�v�14;

import javax.sound.midi.Soundbank;

public class Main {

	public static void main(String[] args) {
		Hampurilainen hamppari;
		Tarjoilija tarjoilija = new Tarjoilija();
		HampurilaisenKasaaja hesehamppari = new HeseHamppari();
		HampurilaisenKasaaja m�kkihamppari = new M�kkiHamppari();
		
		tarjoilija.setKasaaja(hesehamppari);
		tarjoilija.kasaaHampurilainen();
		hamppari = tarjoilija.getHampurilainen();
		System.out.println(hamppari.asd());
		
		tarjoilija.setKasaaja(m�kkihamppari);
		tarjoilija.kasaaHampurilainen();
		hamppari = tarjoilija.getHampurilainen();
		System.out.println(hamppari.asd());


		
		

			
		}

}
