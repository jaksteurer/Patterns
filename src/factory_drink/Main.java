package factory_drink;

public class Main {

	public static void main(String[] args) {
		Factory f = new Factory();
		
		Drink Monkey = f.createDrink(Factory.GIN);
		Drink JimBeam = f.createDrink(Factory.WHISKEY);
		Drink Bombay = f.createDrink(Factory.GIN);
		
		System.out.println(Monkey.getName()+": \n\tAlkoholgehalt: " +Monkey.getAlcContent()+" %");
		System.out.println(JimBeam.getName()+": \n\tAlkoholgehalt: " +JimBeam.getAlcContent()+" %");
		System.out.println(Bombay.getName()+": \n\tAlkoholgehalt: " +Bombay.getAlcContent()+" %");
	}

}
