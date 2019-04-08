package metode;

import java.util.Scanner;

public class KonjNapadaPesaka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Napisati program koji proverava da li je pesak napadnut od strane konja
		// nakon sto unesemo pozicije za jednu i drugu figuru
		// Umesto standardnih sahovskih unosa za poziciju koja bi isla slovo pa broj
		// (npr. a1 ili h5)
		// Unosimo broj pa broj (gde je 1 1 ili 8 5) gde je a=1, b=2, c=3...

		// Unos pozicija za konja i pesaka
		int x1, y1, x2, y2;
		System.out.println("Unesite broj x za broj reda pozicije konja");
		x1 = sc.nextInt();
		System.out.println("Unesite broj y za broj kolone pozicije konja");
		y1 = sc.nextInt();
		System.out.println("Unesite broj x za broj reda pozicije pesaka");
		x2 = sc.nextInt();
		System.out.println("Unesite broj y za broj kolone pozicije pesaka");
		y2 = sc.nextInt();

		// Pozivanje metode unos u uslov i provera da li je unos bio ispravan
		// Ukoliko jeste, pozivanje metode napadPK i provera da li je pesak napadnut ili
		// ne
		if (unos(x1, y1, x2, y2) == false || unos(x1, y1, x2, y2) == false) {
			System.out.println("Pogresan unos polja");
		} else {
			if (napadPK(x1, y1, x2, y2))
				System.out.println("Pesak je napadnut");
			else
				System.out.println("Pesak nije napadnut");
		}
		sc.close();

	}

	// S obzirom da na sahovskoj tabli ima 64 polja i da pozicije za neku figuru
	// mogu biti samo od 1 do 8
	// U metodi unos postavljamo uslov da uneta pozicija ne moze za bilo koju figuru
	// ne moze biti manja od 1 ili veca od 8
	// takodje postavljamo uslov da dve figure ne mogu biti na istoj poziciji
	public static boolean unos(int x1, int y1, int x2, int y2) {
		if ((x1 < 1 || x1 > 8 || y1 < 1 || y1 > 8 || x2 < 1 || x2 > 8 || y1 < 1 || y1 > 8) || (x1 == x2 && y1 == y2))
			return false;
		else
			return true;
	}

	// Ako zamislimo konja na sahovskoj tabli on sa jednog mesta moze da se pomeri
	// na 8 razlicitih mesta
	// Ukoliko je njegova pozicija x1=5 i y1=5 i ukoliko te dve cifre spojimo u broj
	// i dobijemo 55
	// 8 napadnutih polja ce biti polja ciji bi broj (nakon spajanja cifara) imao
	// razlike u odnosu na 55 - 8,12,19,21,-8,-12,-19 ili -21.
	// Drugim recima, ukoliko je pesak napadnut kada bismo od 55 oduzeli broj od
	// nekog sa tih osam polja, nas rezultat bi bio jedan od ovih 8 brojeva
	// Bilo koji drugi rezultat bi znacio da pesak nije napadnut
	public static boolean napadPK(int x1, int y1, int x2, int y2) {
		int p = ((x1 * 10) + y1) - ((x2 * 10) + y2);
		if (p == 8 || p == -8 || p == 12 || p == -12 || p == 19 || p == -19 || p == 21 || p == -21)
			return true;
		else
			return false;

	}
}
