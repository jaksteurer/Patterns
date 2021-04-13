package observer;

public class Main {

	public static void main(String[] args) 
	{
		/*
		 * Observer-Pattern
		 * 	Alle Beobachter werden benachrichtigt
		 *  wenn sich etwas ändern
		 *  hier im beispiel werden alle member
		 *  benachrichtigt wenn sich im chat die 
		 *  message verändert
		 */
		MemberOne m1 = new MemberOne();
		MemberTwo m2 = new MemberTwo();
		MemberThree m3 = new MemberThree();

		MessageGroup g1 = new MessageGroup();

		g1.attach(m1);
		//Nachricht wird von member 1 ausgegeben
		g1.notifyUpdate(new Message("Hallo"));
		g1.attach(m2);
		//Nachricht wird von member 1 und 2 ausgegeben
		g1.notifyUpdate(new Message("Hallo wie gehts"));

		g1.detach(m1);
		g1.attach(m3);
		//Nachricht wird von member 2 und 3 ausgegeben
		g1.notifyUpdate(new Message("Member 3 wurde hinzugefügt"));
	}
}
