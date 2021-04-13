package strategy;

public class Main {
	
	public static void main(String[] args) {
		Dienstleistung friseur = new Dienstleistung();
		System.out.println("Steuertarif f�r Friseur: "+friseur.getSteuertarif()+" %");
		
		Buch harryPotter = new Buch();
		System.out.println("Steuertarif f�r das Buch Harry Potter: "+harryPotter.getSteuertarif()+" %");
		
		Aktien dowJones = new Aktien();
		System.out.println("Steuertarif f�r die Gewinnauszahl von Dow Jones: "+dowJones.getSteuertarif()+" %");
		
		Pflanze sonnenblume = new Pflanze();
		System.out.println("Steuertarif f�r die Pflanze Sonnenblume: "+sonnenblume.getSteuertarif()+" %");
		
		harryPotter.setSteuertarif(new Steuer13());
		System.out.println("\nNeuer Steuertarif f�r das Buch Harry Potter: "+harryPotter.getSteuertarif()+" %");
	}
}
