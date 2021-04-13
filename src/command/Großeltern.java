package command;
//Aufrufer
public class Groﬂeltern {
	private Tv tv;

	public void setTv(Tv tv) {
		this.tv = tv;
	}	
	public void tvEinschalten(String sender) {
		tv.einschalten(sender);
	}
}
