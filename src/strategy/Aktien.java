package strategy;

public class Aktien {

	Steuertarif steuerk = new Steuer27p5(); 

	public void setSteuertarif(Steuertarif steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}
}
