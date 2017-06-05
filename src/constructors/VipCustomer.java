package constructors;

public class VipCustomer {
	private String name;
	private double creditlimit;
	private String email;
	
	public VipCustomer(){
		this("Mubeen", 15000.0, "Mubeen@gmail.com");
	}


	public VipCustomer(String name, double creditlimit) {
		this(name, creditlimit, "unknown@gmail.com");
	}


	public VipCustomer(String name, double creditlimit, String email) {
		this.name = name;
		this.creditlimit = creditlimit;
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public double getCreditlimit() {
		return creditlimit;
	}


	public String getEmail() {
		return email;
	}
	
	
	
}
