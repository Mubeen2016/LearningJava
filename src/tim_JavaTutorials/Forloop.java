package tim_JavaTutorials;

public class Forloop{

	public static void main(String[] args) {
		calculateInterestRate(10000);
		
	}

//	public static double calculateInterest(double amount, double interestRate){
//		return (amount*(interestRate/100));
//	}
	public static void calculateInterestRate(double amount){
		double interest;
		for(interest=8.0; interest>=2.0;interest--){
			double a = (double) (amount*(interest/100));
			System.out.println("10,000 at " + " "+ interest + "% interest" + " "+ String.format("%.2f", a));
		}
	
	}
}
