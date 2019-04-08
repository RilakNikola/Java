package parcela;

public abstract class Parcela {

	public static int uid = 0;
	private int id;
	private double povrsina;

	// Konstruktor sa povrsinom koja ce biti uneta kada se napravi parcela
	// i automatskim id-em koji ce se povecavati kad god se napravi nova parcela
	public Parcela(double povrsina) {
		this.povrsina = povrsina;
		this.id = ++uid;
	}

	// Getteri za id, povrsinu i vrstu
	public int getId() {
		return id;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public char getVrsta() {
		return vrsta();
	}

	// Dve apstraktne metode koje su apstraktne
	// jer ce se razlikovati u podklasama Suma i Njiva
	public abstract char vrsta();

	public abstract double prinos(int godina);

	// Tekstualni ispis u obliku "VRSTA-ID[POVRSINA]"
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(vrsta()).append("-").append(this.getId());
		sb.append("[").append(this.getPovrsina()).append("km2]");
		return sb.toString();

	}

}
