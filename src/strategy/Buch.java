package strategy;

public class Buch {
	
	Steuertarif steuerk = new Steuer10(); 

	public void setSteuertarif(Steuertarif steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}
}
