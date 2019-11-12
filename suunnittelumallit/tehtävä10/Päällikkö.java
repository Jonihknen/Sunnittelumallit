package tehtävä10;

public class Päällikkö extends Palkankorotus{

	@Override
	public void process(int määrä) {
		if (määrä < 0.05*palkka) {
			System.out.println("Päällikkö korotetti palkkaa " + määrä + " euroa");
		} else if (successor != null){
			successor.process(määrä);
		}
		
	}
}
