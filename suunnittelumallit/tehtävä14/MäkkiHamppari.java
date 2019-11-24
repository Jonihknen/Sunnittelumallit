package tehtävä14;

public class MäkkiHamppari extends HampurilaisenKasaaja{

	@Override
	public void createJuusto() {
		hampurilainen.setJuusto("mäkkijuusto");
		
	}
	@Override
	public void createPihvi() {
		hampurilainen.setPihvi("mäkkipihvi");
		
	}
	@Override
	public void createLeivät() {
		hampurilainen.setLeivät("mäkkileivät");
		
	}
	
	
}
