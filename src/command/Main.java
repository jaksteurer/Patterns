package command;

public class Main {

	public static void main(String[] args) {
		//Empf‰nger erstellen
		DisneyPlus dp = new DisneyPlus();
		ZDF zdf = new ZDF();
		ORF orf1 = new ORF();
		
		Eltern papa = new Eltern();
		papa.setTv(new ORFBefehl(orf1));		
		papa.tvEinschalten("ORF");
		
		Kind emil = new Kind();
		emil.setTv(new DisneyPlusBefehl(dp));
		emil.tvEinschalten("Disney Plus");
		
		Groﬂeltern groﬂmutter = new Groﬂeltern();
		groﬂmutter.setTv(new ZDFBefehl(zdf));
		groﬂmutter.tvEinschalten("zdf");

	}

}
