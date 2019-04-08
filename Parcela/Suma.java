package parcela;

public class Suma extends Parcela {

	private double povrsinaStabala;
	private double prinosStabala;
	private int periodSazrevanja;

	// Konstruktor sa svim argumentima
	public Suma(double povrsina, double povrsinaStabala, double prinosStabala, int periodSazrevanja) {
		super(povrsina);
		this.povrsinaStabala = povrsinaStabala;
		this.prinosStabala = prinosStabala;
		this.periodSazrevanja = periodSazrevanja;
	}

	// Podrazumevani konstruktor
	public Suma(double povrsina) {
		super(povrsina);
		this.povrsinaStabala = 0;
		this.prinosStabala = 0;
		this.periodSazrevanja = 0;
	}

	// Getteri i setteri
	public double getPovrsinaStabala() {
		return povrsinaStabala;
	}

	public double getPrinosStabala() {
		return prinosStabala;
	}

	public int getPeriodSazrevanja() {
		return periodSazrevanja;
	}

	public void setPovrsinaStabala(double povrsinaStabala) {
		this.povrsinaStabala = povrsinaStabala;
	}

	public void setPrinosStabala(double prinosStabala) {
		this.prinosStabala = prinosStabala;
	}

	public void setPeriodSazrevanja(int periodSazrevanja) {
		this.periodSazrevanja = periodSazrevanja;
	}

	// Metoda za odredjivanje jednoslovne vrste.
	// U tekstu je zadato da je jednoslovna vrsta za sumu "S"
	@Override
	public char vrsta() {
		return 'S';
	}

	// Metoda za odredjivanje prinosa po formuli iz teksta zadatka
	@Override
	public double prinos(int godina) {
		if (godina <= 0 || this.getPeriodSazrevanja() <= 0)
			System.out.println("Greska pri unosu");
		return this.getPovrsina() / this.povrsinaStabala * this.prinosStabala * (godina / this.periodSazrevanja);
	}

	// Tekstualni ispis u obliku "Parcela:(povrsstabla,prinosSt,Period)"
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(":(").append(this.getPovrsinaStabala()).append(",");
		sb.append(this.getPrinosStabala()).append(",").append(this.getPeriodSazrevanja()).append(")");
		return sb.toString();

	}
}
