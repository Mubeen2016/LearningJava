package oops;

public class Loop {

	public static void main(String[] args) {
		boolean result= isPrime(11);
	System.out.println(result);
	}
	public static boolean isPrime(int n){
		if(n==1){
			return false;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
