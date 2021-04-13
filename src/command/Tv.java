package command;
//Befehle
interface Tv {
	public void einschalten(String sender);
	}
class DisneyPlusBefehl implements Tv{
	private DisneyPlus dPlus;
	public DisneyPlusBefehl(DisneyPlus s) {
		this.dPlus = s;
	}
	@Override
	public void einschalten(String sender) {
		this.dPlus.Sendereinstellen(sender);
	}
}
class ZDFBefehl implements Tv{
	private ZDF zdf;
	public ZDFBefehl(ZDF s) {
		this.zdf = s;
	}
	@Override
	public void einschalten(String sender) {
		this.zdf.Sendereinstellen(sender);
	}	
}
class ORFBefehl implements Tv{
	private ORF orf;
	public ORFBefehl(ORF s) {
		this.orf = s;
	}
	@Override
	public void einschalten(String sender) {
		this.orf.Sendereinstellen(sender);
	}
}