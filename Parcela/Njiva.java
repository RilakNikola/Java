package parcela;

public class Njiva extends Parcela {

	private double prinosM;

	// Konstruktor sa svim argumentima
	public Njiva(double povrsina, double prinosM) {
		super(povrsina);
		this.prinosM = prinosM;
	}

	// Podrazumevani konstruktor
	public Njiva(double povrsina) {
		super(povrsina);
		this.prinosM = 0;
	}

	// Getter i setter za prinos
	public double getPrinosM() {
		return prinosM;
	}

	public void setPrinos(double prinosM) {
		this.prinosM = prinosM;
	}

	// Metoda za odredjivanje jednoslovne vrste.
	// U tekstu je zadato da je jednoslovna vrsta za njivu "N"
	@Override
	public char vrsta() {
		return 'N';
	}

	// Metoda za odredjivanje prinosa po formuli iz teksta zadatka
	@Override
	public double prinos(int godina) {
		if (godina <= 0)
			System.out.println("Greska pri unosu");
		return this.getPovrsina() * this.prinosM * godina;
	}

	// Tekstualni ispis u obliku "Parcela:PrinosPoKvM"
	@Override
	public String toString() {
		return super.toString() + ":" + this.prinosM;

	}

}
