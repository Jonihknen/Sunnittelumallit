package tehtävä13;

public class Leveler {
	
	Charmeleon p1 = new Charmeleon("charmeleon 1");
	Charmeleon p2 = new Charmeleon("charmeleon 2");
	Charizard p3 = new Charizard("charizard 1");
	Charmander p4 = new Charmander("charmander 1");
	

	FightVisitor visitor2 = new FightVisitor();
	
	public void fight() {
		visitor2.Visit(p1);
		visitor2.Visit(p2);
		visitor2.Visit(p3);
		visitor2.Visit(p4);
	}
	
	

}
