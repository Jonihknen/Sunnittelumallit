package tehtävä8;

import java.util.ArrayList;
import java.util.Scanner;

public class RPS extends Game{
	
	int p1;
	int p2;

	@Override
	void initializeGame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void makePlay(int player) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int i = 1;
		while(i < 3) {
			System.out.println("Pelaaja " + i + " valitse aseesi");
			System.out.println("1. Kivi");
			System.out.println("2. Paperi");
			System.out.println("3. Sakset");
		int valinta = scanner.nextInt();
		lista.add(valinta);
		i++;
		}
		p1 = lista.get(0);
		p2 = lista.get(1);
		lista.clear();
		System.out.println("pelaajan 1 valinta = " + toString(p1));
		System.out.println("pelaajan 2 valinta = " + toString(p2));
		System.out.println();
		if (p1 == p2) {
			System.out.println("tasapeli, uusi kierros\n");
		}
	}

	@Override
	boolean endOfGame() {
		if (p1 != p2) {
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		if(p1 == 1 && p2 == 2) {
			System.out.println("pelaaja 2 voittaa");
		} else if(p1 == 1 && p2 == 3) {
			System.out.println("pelaaja 1 voittaa");
		} else if(p1 == 2 && p2 == 1) {
			System.out.println("pelaaja 1 voittaa");
		} else if(p1 == 2 && p2 == 3) {
			System.out.println("pelaaja 2 voittaa");
		} else if(p1 == 3 && p2 == 2) {
			System.out.println("pelaaja 1 voittaa");
		} else if(p1 == 3 && p2 == 1) {
			System.out.println("pelaaja 2 voittaa");
		} 
		
	}
	private String toString(int numero) {
		if (numero == 1) {
			return("Kivi");
		}else if (numero == 2) {
			return("Paperi");
		}else if (numero == 3) {
			return("sakset");
		}
		return null;
	}
	
		
}
