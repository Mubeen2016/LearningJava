package tim_JavaTutorials;

public class Bank {

	/*private String account_number;
	private double balance;
	private String Customer_name;
	private String email;
	private String Phone_number;
	
	public Bank(){
		this("12365",25000,"Mubeen", "default email","256389");
		System.out.println("Empty Constructor called");
	}
	public Bank(String account_number, double balance, String customer_name, String email, String phone_number) {
		System.out.println("account constructor is called");
		this.account_number = account_number;
		this.balance = balance;
		this.Customer_name = customer_name;
		this.email = email;
		this.Phone_number = phone_number;
	}
	
	public String getAccount_number() {
		return account_number;
	}

	public double getBalance() {
		return balance;
	}

	public String getCustomer_name() {
		return Customer_name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone_number() {
		return Phone_number;
	}
	public void deposit_fund(double depositAmount){
		this.balance+=depositAmount;
		System.out.println("Deposit of" +depositAmount+"made. New balance is"+this.balance);
		
	}
	public void withdraw_fund(double withdrwalAmount){
		if(balance -withdrwalAmount<=0){
			System.out.println("only" + this.balance+ "available. cannot be processed");
		}else{
			balance=balance-withdrwalAmount;
			System.out.println("withdrawal of" + withdrwalAmount+ "processed. Remaining amount of balance is" +this.balance);
		}
	} */
	private String name;
	private double creditLimit;
	private String email;
	
	public Bank(){
		this("default name",50000,"default email");
		System.out.println("Empty Constructor");
	}
	
	public Bank(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	public Bank(String name, double creditLimit){
		this("Bob",55000,"default email");
	}
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	
	
}
