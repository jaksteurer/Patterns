package factory_drink;

public interface Drink {
	
	public double getAlcContent();
	public String getName();
}

class GinTonic implements Drink {

	public double getAlcContent() {
		return 47;
	}
	public String getName() {
		return "GinTonic";
	}

}

class Whiskey implements Drink {

	public double getAlcContent() {
		return 63;
	}
	public String getName() {
		return "Whiskey";
	}

}