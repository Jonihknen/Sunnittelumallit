package teht�v�10;

public class P��llikk� extends Palkankorotus{

	@Override
	public void process(int m��r�) {
		if (m��r� < 0.05*palkka) {
			System.out.println("P��llikk� korotetti palkkaa " + m��r� + " euroa");
		} else if (successor != null){
			successor.process(m��r�);
		}
		
	}
}
