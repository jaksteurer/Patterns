package singleton;
import java.io.IOException;

public class Singleton_Pattern {
	
	//Object vom Typ Singleton_Pattern 
	//wird erstellt aber noch nicht instanziert
    private static Singleton_Pattern Instance ; 
    
    //Konstruktor
    private Singleton_Pattern() { 
    } 
     
    //Methode vom Typ Singleton_Pattern 
    public static Singleton_Pattern getInstance() { 
    	//Überprüfung ob instance schon ein Wert zugewiesen
    	//wurde oder nicht (Instanziiert)
      if(Instance == null) {
    	  //Wenn true wird Instance instanziiert und zeigt somit
    	  //nicht mehr auf null
    	  Singleton_Pattern.Instance = new Singleton_Pattern();
    	  System.out.println("Objekt wurde erstellt");
      }else {
    	  System.out.println("Es existiert bereits ein Objekt");
      }
    	return Instance; 
    } 
    public static void main(String[] args) throws IOException {
    	//bei singlet1 wird ein neues Objekt erstellt 
    	Singleton_Pattern singlet1 = Singleton_Pattern.getInstance();
    	//bei singlet2 springt es ins else, da schon ein Objekt
    	//(singlet2) existiert.
    	Singleton_Pattern singlet2 = Singleton_Pattern.getInstance();
    	
    }

}
