package classeschallenges;

public class Main {

	public static void main(String[] args) {
		//Bank mubeen = new Bank("AB256325622",15000.00,"Mub","Mub@gmail.com","224-256-6589");
		Bank mubeen = new Bank();
		String result =mubeen.toString();
		System.out.println(result);
		mubeen.withDrawalAmount(100.0);
		
		
		mubeen.depositAmount(10000.00);
		mubeen.withDrawalAmount(1000.0);
		mubeen.withDrawalAmount(12000.0);
	}

}
