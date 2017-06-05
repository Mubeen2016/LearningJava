package tim_JavaTutorials;

public class Bank_Main {

	public static void main(String[] args) {
		/*Bank account = new Bank();
		System.out.println(account.getCustomer_name());
		System.out.println(account.getEmail());
		System.out.println(account.getPhone_number());
		account.deposit_fund(25000);
		account.withdraw_fund(15000); */
		Bank account = new Bank();
		System.out.println(account.getName());
		System.out.println(account.getEmail());
		System.out.println(account.getCreditLimit());
		
		Bank account1 = new Bank("mubeen", 100.00);
		System.out.println(account1.getName());
		System.out.println(account1.getCreditLimit());
		
		Bank account2 = new Bank("Steven", 85000, "Steven.12@gmail.com");
		System.out.println(account2.getCreditLimit());
	}

}
