package factory_tier;

public interface Tier {
	
	public String getAnimal();			//Welches Tier
	public String getAnimalSpecies();	//Tierart
	public String getAnimalColor();		//Tierfarbe
}

class Hund implements Tier {
	public String getAnimal() {
		return "Hund";
	}
	public String getAnimalSpecies() {
		return "S‰ugetier";
	}
	public String getAnimalColor() {
		return "Braun";
	}
}

class Spinne implements Tier {
	public String getAnimal() {
		return "Spinne";
	}
	public String getAnimalSpecies() {
		return "Insekt";
	}
	public String getAnimalColor() {
		return "Dunkelbau";
	}
}

class Adler implements Tier {
	public String getAnimal() {
		return "Adler";
	}
	public String getAnimalSpecies() {
		return "Raubtier";
	}
	public String getAnimalColor() {
		return "Weiﬂ-Braun";
	}
}