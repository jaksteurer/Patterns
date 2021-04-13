package strategy;

public class Pflanze {

	Steuertarif steuerk = new Steuer13(); 

	public void setSteuertarif(Steuertarif steuer) { 
		steuerk = steuer;
	}
	public double getSteuertarif() {
		return steuerk.printSteuerklasse();
	}
}
