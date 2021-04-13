package factory_tier;

public class Factory {
	
	public static final int HUND = 0;
	public static final int SPINNE = 1;
	public static final int ADLER = 2;
	

	public Tier createTier(int id) {
		switch(id) {
			case 0:
				return new Hund();
			case 1:
				return new Spinne();
			case 2:
				return new Hund();
			default:
				throw new IllegalArgumentException("Falsche Zahl");
		}		
	}
}
