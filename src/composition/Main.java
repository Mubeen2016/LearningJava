package composition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20,20,5);
		Case theCase = new Case("220", "Dell", "240", dimensions);
		
		//Resolution resolution = new Resolution(2540,1440);
		Monitor theMonitor = new Monitor("27inches Beast", "Acer", 27, new Resolution(2540,1440));
		
		Motherboard theMotherboard = new Motherboard("BJ200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, theMonitor,theMotherboard);
		
		thePC.powerUp();
//		thePC.getMonitor().drawPixelAt(1500, 1200, "Red");
//		thePC.getMotherboard().loadProgram("Windows 1.0");
//		thePC.getTheCase().pressPowerButton();
	}

}
