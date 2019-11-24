package tehtävä14;

import javax.sound.midi.Soundbank;

public class Main {

	public static void main(String[] args) {
		Hampurilainen hamppari;
		Tarjoilija tarjoilija = new Tarjoilija();
		HampurilaisenKasaaja hesehamppari = new HeseHamppari();
		HampurilaisenKasaaja mäkkihamppari = new MäkkiHamppari();
		
		tarjoilija.setKasaaja(hesehamppari);
		tarjoilija.kasaaHampurilainen();
		hamppari = tarjoilija.getHampurilainen();
		System.out.println(hamppari.asd());
		
		tarjoilija.setKasaaja(mäkkihamppari);
		tarjoilija.kasaaHampurilainen();
		hamppari = tarjoilija.getHampurilainen();
		System.out.println(hamppari.asd());


		
		

			
		}

}
