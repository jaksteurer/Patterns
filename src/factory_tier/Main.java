package factory_tier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory f = new Factory();
		
		Tier Vogelspinne = f.createTier(Factory.SPINNE);
		Tier Bulldogge = f.createTier(Factory.HUND);
		Tier Steinadler = f.createTier(Factory.ADLER);
		//%s = Platzhalter
		System.out.printf("Name: %s\nFarbe: %s\nTierart: %s",Vogelspinne.getAnimal(),Vogelspinne.getAnimalColor(),Vogelspinne.getAnimalSpecies()+"\n");
		System.out.printf("\nName: %s\nFarbe: %s\nTierart: %s",Bulldogge.getAnimal(),Bulldogge.getAnimalColor(),Bulldogge.getAnimalSpecies()+"\n");
		System.out.printf("\nName: %s\nFarbe: %s\nTierart: %s",Steinadler.getAnimal(),Steinadler.getAnimalColor(),Steinadler.getAnimalSpecies()+"\n");

	}
}

/*
 * Vorteile
 * ----------
 * Entkopplung -> Client muss den Code nicht kennen; 
 * 	passiert erst nachdem man erst nach Methoden aufruft untersucht und
 *  	dann wird erst ein Objekt erstellt -> Benutzer muss den Code nicht kennen
 * Wartung des Codes einfacher, weil Objekterstellung zentralisiert stattfindet
 * 	man fixiert eine Stelle an der Instanzen erstellt werden
 * Felxibilität -> User bekommt nicht mit ob eine Klasse abgeändert wird
 * 
 * ------------------------------------------------------------------------
 * Nachteile 
 * ----------
 * Hohe Zahl an erforderlichen Klassen -> Erweiterungen sind sehr aufwendig (Skalierbarkeit)
 * läuft auf Unterklassenbildung hinaus -> Von Tier auf Hund von Hund auf Bulldogge z.B.
 * Für jedes Produkt/(Tier) muss eine neue Klasse erstellt werden
 * Overhead vom Code muss man die Factory immer erweitern Content-Grade
 * 
 * 
 */

