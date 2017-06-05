package oopsChallenge1;

public class DulexBurger extends Hamburger {

	public DulexBurger() {
		super("Delux", "beef", 14.54, "white");
		super.addHamburgerAddition1("chips", 2.75);
		super.addHamburgerAddition2("drinks", 1.95);
		
		
		
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot be added this iteam in dulex burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot be added this iteam in dulex burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot be added this iteam in dulex burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot be added this iteam in dulex burger");
	}
	
	

}
