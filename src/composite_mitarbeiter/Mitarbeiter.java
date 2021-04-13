package composite_mitarbeiter;
import java.util.ArrayList;
import java.util.List;

//Component
abstract class Mitarbeiter {
	public abstract int getMitarbeiterAnzahl();
	public abstract void print(String abstand);

	private String name;
	private int telefonNr;
	//Konstruktor, in dem die Attribute gesetzt werden können
	public Mitarbeiter(String name, int telefonNr) {
		this.name = name;
		this.telefonNr = telefonNr;
	}
	//Getter und Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTelefonNr() {
		return telefonNr;
	}
	public void setTelefonNr(int telefonNr) {
		this.telefonNr = telefonNr;
	}
}
//Composite
class Abteilungsleiter extends Mitarbeiter{
	//Hinweis: der Stringparameter dient lediglich der Einrückung
    public void print(String abstand) {
        System.out.println(abstand + "Abteilungsleiter " + getName() + " (" + getAbteilung() + "). Tel: " + getTelefonNr());
        for (Mitarbeiter ma : mitarbeiter) {
            ma.print(abstand + "\t");//Einrückung
        }
    }
    
    /*
     * Restlicher Code:
     */
    private List<Mitarbeiter> mitarbeiter = new ArrayList<Mitarbeiter>();
    private String abteilung;
    
    public String getAbteilung() {
        return abteilung;
    }
    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
    //Konstruktor
    public Abteilungsleiter(String name, String abteilung, int telefonNr) {
        super(name, telefonNr);
        this.abteilung = abteilung;
    }
    //Der Rest ist bekannt
    public int getMitarbeiterAnzahl() {
        int summe = 1; //1 für sich selbst
        for (Mitarbeiter ma : mitarbeiter) {
            summe += ma.getMitarbeiterAnzahl();
        }
        return summe;
    }
    //Verwaltungsmethoden...
    public void add(Mitarbeiter ma) {
        mitarbeiter.add(ma);
    }

    public void remove(Mitarbeiter ma) {
        mitarbeiter.remove(ma);
    }

    public Mitarbeiter getMitarbeiter(int index) {
        return mitarbeiter.get(index);
    }
}
//Leaf
class AtomarerMitarbeiter extends Mitarbeiter{

	@Override
	public void print(String abstand) {
		System.out.println(abstand + getName() + ". Tel: " + getTelefonNr());
	}	
	//Konstruktor
	public AtomarerMitarbeiter(String name, int telefonNr) {
		super(name, telefonNr);
	}
	@Override
	public int getMitarbeiterAnzahl() {
		return 1;
	}
}
