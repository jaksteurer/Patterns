package composite_mitarbeiter;

public class Main {
	public static void main(String[] args) {
		/*
	     * Firmenhierarchie einmalig aufbauen
	     */
	    //Vertrieb
	    Abteilungsleiter al1 = new Abteilungsleiter("W. Fischer", "Vertrieb", 1);
	    al1.add(new AtomarerMitarbeiter("P. Meier", 123));
	    al1.add(new AtomarerMitarbeiter("I. Schulz", 112));
	    //Technologie
	    Abteilungsleiter al2 = new Abteilungsleiter("T. Kunz", "Technologie", 2);
	    al2.add(new AtomarerMitarbeiter("M. Rehberg", 223));
	    al2.add(new AtomarerMitarbeiter("O. Riedel", 212));
	    //Entwicklung
	    Abteilungsleiter al3 = new Abteilungsleiter("M. Hardbrot", "Entwicklung", 3);
	    al3.add(new AtomarerMitarbeiter("M. Rehberg", 323));
	    al3.add(al2);
	    //Vorstand
	    Abteilungsleiter vorstand = new Abteilungsleiter("A. Müller", "Vorstand", 4);
	    vorstand.add(al1);
	    vorstand.add(new AtomarerMitarbeiter("U. Temann", 442));
	    vorstand.add(al3);

	    /*
	     * Firmenhierarchie ausdrucken
	     */
	    vorstand.print("");
	}

}
