package teht‰v‰10;

public class Toimitusjohtaja extends Palkankorotus{

	@Override
	public void process(int m‰‰r‰) {
		if (m‰‰r‰ < 0.08*palkka) {
			System.out.println("Toimitusjohtaja korotetti palkkaa " + m‰‰r‰ + " euroa");
		} else {
			System.out.println("Ulos t‰‰lt‰ t. niinistˆ");
		}
		
	}
}