package encapsulationChallenge;

public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer(50,true);
		System.out.println("Inital page count = " + printer.getPagesPrinted());
		int pagesPrinted = printer.printPages(4);
		System.out.println("Pages printed was " + pagesPrinted + "new total print count for printer = " + printer.getPagesPrinted());
		int pagesPrinted1 = printer.printPages(8);
		System.out.println("Pages printed was " + pagesPrinted1 + "new total print count for printer = " + printer.getPagesPrinted());
	}
}
