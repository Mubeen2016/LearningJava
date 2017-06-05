package constructors;

public class Main {

	public static void main(String[] args) {
		VipCustomer person = new VipCustomer();
		System.out.println(person.getName());
		
		VipCustomer person1 = new VipCustomer("Bob", 45000);
		System.out.println(person1.getEmail());
		
		VipCustomer person2 = new VipCustomer("Jim",50000,"Jim@gmail.com");
		System.out.println(person2.getCreditlimit());

	}

}
