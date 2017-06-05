package classeschallenges;

public class Bank {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public Bank(){
		this("DB562323",5200,"Naaz","Naaz@gmail.com","225-632-9856");
		System.out.println("Empty constructor called");
		
	}
	
	
	public Bank(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", balance=" + balance + ", customerName=" + customerName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}





	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void depositAmount(double amount) {
		this.balance += amount;
		System.out.println("Amount deposited " + " " + amount + "and the total amount is" + " " + this.balance);
	}

	public void withDrawalAmount(double withdrawal) {
		if (this.balance - withdrawal <= 0) {
			System.out.println("only" + " " + balance + " " + "is available. cannot be processed");
		} else {
			this.balance -= withdrawal;
			System.out.println(
					"Withdrawal of" + withdrawal + "is processed and remaiining balance is" + " " + this.balance);
		}
	}
}
