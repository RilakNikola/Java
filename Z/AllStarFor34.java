package glavni1;

import java.util.Scanner;

public class AllStarFor34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Napisati program koji racuna koliko je kosarkas osvojio poena na nba all star
		// takmicenju u sutiranju brzih trojki.
		// Pravila su sledeca:
		// Kosarkas sutira po 5 lopti sa 5 razlicitih pozicija
		// Sa prve 4 pozicije prve 4 lopte vrede 1 poen dok 5. lopta vredi 2 poena
		// Sa 5. pozicije svih 5 lopti vrede dva poena
		// Igrac je osvojio poen ukoliko je rezultat operacije Math.rand()>0.5

		int pozicija = 1;
		int rezultat = 0;

		// Kosarkas krece sa 1. pozicije i sve dok ne dodje do 5. pozicije
		for (pozicija = 1; pozicija <= 5; pozicija++) {
			// Uzimace 1. loptu i sve dok ne stigne do 5. lopte
			for (int lopta = 1; lopta <= 5; lopta++) {
				// Ukoliko je na pozicijama koje nisu peta pozicija
				if (pozicija < 5) {
					// I ukoliko postigne poen
					if (Math.random() > 0.5)
						// Ukoliko je postigao poen sa loptom koja nije 5. lopta
						// rezultat ce se povecati za jedan, ukoliko je 5. lopta
						// rezultat ce se povecati za dva
						if (lopta < 5)
							rezultat += 1;
						else
							rezultat += 2;
					// Ukoliko je pak na 5. poziciji i ukoliko postigne poen bilo kojom loptom
					// rezultat ce se povecati za dva
				} else {
					if (Math.random() > 0.5) {
						if (lopta <= 5)

							rezultat += 2;
					}
				}

			}

		}

		System.out.println("Kosarkas je postigao " + rezultat + "/34 poena.");
		sc.close();

	}
}
