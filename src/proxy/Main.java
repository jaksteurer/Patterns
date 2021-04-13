package proxy;

public class Main {

	public static void main(String[] args) {
			
		/*
		 * Proxy
		 * 2 Klassen: Proxyklasse und Reale Klasse
		 * Sicherheit für den Client
		 * Nac Eingabe von Passwort und Username
		 * kommt man in die Reale Klasse
		 */
		ProxyBankkonto Konto = new ProxyBankkonto(
				"Hans Maier",                	//Name
				"2365 2356 4568 5789 7892",    	//Kontonummer
				175064.34,    					//Kontostand
				"987");							//Passwort
		Konto.functions();
	}
	
}
