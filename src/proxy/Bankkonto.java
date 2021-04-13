package proxy;

public class Bankkonto {
	public String name = "";
	public String kontonr;
	public double kontostand;

	public Bankkonto(String name, String kontonr, double kontostand) {
		this.name = name;
		this.kontonr = kontonr;
		this.kontostand = kontostand;
	}
	public void showData() {
		System.out.println("Name:\t\t\t"+name);
		System.out.println("Kontonummer:\t\t"+kontonr);
		if(kontostand<0) {
			System.out.printf("Neuer Kontostand:\t%,.2f €\t(Achtung Sie sind im Minus)\n",getKontostand());
		}else System.out.printf("Kontostand:\t\t%,.2f €\n",getKontostand());
	}
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double menge) {
		this.kontostand += menge;
	}



}
