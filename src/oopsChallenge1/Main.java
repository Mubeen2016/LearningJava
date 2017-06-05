package oopsChallenge1;

public class Main {

	public static void main(String[] args) {

		Hamburger hamburger = new Hamburger("Basic","Beef",3.50,"Wheet");
		double price = hamburger.itemizeHamburger();
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("lettuce", 0.70);
		hamburger.addHamburgerAddition3("Cheese", 1.17);
		 System.out.println("Total price for the burger is " +hamburger.itemizeHamburger());
		System.out.println("*************************************************");
		 HealthyBurger healthyburger = new HealthyBurger("steak", 5.30);
		 healthyburger.addHealthAddition1("spinach", 0.58);
		 healthyburger.addHealthAddition2("cucumber", 0.98);
		 System.out.println("Total price for Health burger is "+healthyburger.itemizeHamburger());
		 
		 DulexBurger db = new DulexBurger();
		 db.addHamburgerAddition1("something", 50.36);//cannot be added as we have over ridden..
		 db.itemizeHamburger();
		 
	}

}
