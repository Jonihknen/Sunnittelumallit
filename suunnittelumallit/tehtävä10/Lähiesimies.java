package teht‰v‰10;

public class L‰hiesimies extends Palkankorotus {


	@Override
	public void process(int m‰‰r‰) {
		if (m‰‰r‰ < 0.02*palkka) {
			System.out.println("L‰hiesimies korotetti palkkaa " + m‰‰r‰ + " euroa");
		} else if (successor != null){
			successor.process(m‰‰r‰);
		}
		
	}
}
