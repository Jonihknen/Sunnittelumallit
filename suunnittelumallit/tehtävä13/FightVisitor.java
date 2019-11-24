package tehtävä13;

import java.util.Random;

public class FightVisitor implements Visitor{

	private int xp = 0;
	
	public FightVisitor() {
	}
	
	public void Visit(Charmander charmander) {
		if (randomnumba() > 45) {
			xp = charmander.getXp()+60;
			charmander.setXp(xp);
			System.out.println(charmander.getNimi() + " wins " +  "60 xp gained " + ", total xp = " + charmander.getXp());
		}else {
			System.out.println(charmander.getNimi() + " loses , total xp = " + charmander.getXp());
		}
	}

	public void Visit(Charmeleon charmeleon) {
		if (randomnumba() > 55) {
			xp = charmeleon.getXp()+50;
			charmeleon.setXp(xp);
			System.out.println(charmeleon.getNimi() + " wins " +  "50 xp gained " + ", total xp = " + charmeleon.getXp());
		}else {
			System.out.println(charmeleon.getNimi() + " loses , total xp = " + charmeleon.getXp());
		}
	}

	public void Visit(Charizard charizard) {
		if (randomnumba() > 65) {
			xp = charizard.getXp()+40;
			charizard.setXp(xp);
			System.out.println(charizard.getNimi() + " wins " +  "40 xp gained " + ", total xp = " + charizard.getXp());
		}else {
			System.out.println(charizard.getNimi() + " loses , total xp = " + charizard.getXp());
		}
		
	}
	public int randomnumba() {
	Random r = new Random();
	int low = 1;
	int high = 100;
	int result = r.nextInt(high-low) + low;
	return result;
	}
	

}
