package tehtävä14;

public class HeseHamppari extends HampurilaisenKasaaja{


		@Override
		public void createJuusto() {
			hampurilainen.setJuusto("hesejuusto");
			
		}
		@Override
		public void createPihvi() {
			hampurilainen.setPihvi("hesepihvi");
			
		}
		@Override
		public void createLeivät() {
			hampurilainen.setLeivät("heseleivät");
			
		}

}
