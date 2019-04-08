package parcela;

public class GlavniProgram {

	public static void main(String[] args) {

		// Kreiranje niza parcela
		Parcela[] p = new Parcela[5];

		// Kreiranje objekata i stavljanje istih u niz
		Njiva n1 = new Njiva(300, 5);
		p[0] = n1;
		Suma s1 = new Suma(100, 5, 20, 2);
		p[1] = s1;
		Njiva n2 = new Njiva(1000, 10);
		p[2] = n2;
		Suma s2 = new Suma(1000, 500, 50, 1);
		p[3] = s2;
		Parcela n3 = new Njiva(300, 5);

		// Petlja koja ce proci kroz niz parcela i ispisati prinos u toku od 3 godine za
		// svaku parcelu koja je unutar niza
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null)
				continue;
			System.out.println("Prinos " + (i + 1) + ". parcele u toku tri godine je: " + p[i].prinos(3));

		}

		// Ispis kreiranih objekata i menjanje prinosa na jednom i od njih
		System.out.println(n1);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		n1.setPrinos(50);
		System.out.println(n1);
		System.out.println(p[0]);
		System.out.println(n3);

		// S obzirom da je prinos promenjen, petlja koja ce opet proci kroz niz parcela
		for (int i = 0; i < p.length; i++) {
			if (p[i] == null)
				continue;
			System.out.println("Prinos " + (i + 1) + ". parcele u toku tri godine je: " + p[i].prinos(3));

		}

	}
}
