package strategy;

public class Dienstleistung {

	Steuertarif steuerk = new Steuer20(); 

	public void setSteuertarif(Steuertarif steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}
}
