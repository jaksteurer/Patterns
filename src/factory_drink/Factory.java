package factory_drink;

//Konstruktor
public class Factory {
	public static final int GIN = 0;
	public static final int WHISKEY = 1;
	
	//Methode vom Typ Drink(Interface)
	public Drink createDrink (int id) {
		if(id==0) {
			//Objekt wird durch direkten Methodenaufruf erstellt
			return new GinTonic();
		}else if(id==1) {
			//Objekt wird durch direkten Methodenaufruf erstellt
			return new Whiskey();
		}else {
			throw new IllegalArgumentException("Zahl muss 0 oder 1 sein");
		}		
	}

}
