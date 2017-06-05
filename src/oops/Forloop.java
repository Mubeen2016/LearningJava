package oops;

public class Forloop {

	public static void main(String[] args) {
//		int count=0;
//		for(int i=10;i<50;i++){
//			if(isPrime(i)){
//				count++;
//				System.out.println("Number" +i+ "is a prime number");
//				if(count==10){
//					System.out.println("Exiting for loop");
//					break;
//				}
//			}
//		}
		int evenNumbersFound = 0;
		int number=0;
		int finishNumber = 20;
//		for(int i=2;i<=20;i++){
//			if(isEvenNumber(i)){
//				count++;
//				System.out.println("Number" +i+ "is a even number");
//			}
//		}
		while(number<=finishNumber){
			if(!isEvenNumber(number)){
				number++;
				continue;
			}
			System.out.println("Even Numbers are" +number);
			number++;
			evenNumbersFound++;
			if(evenNumbersFound>=5){
				break;
			}
		}
		System.out.println("Even Numbers Found: "+ evenNumbersFound);
	}
//	public static boolean isPrime(int n){
//		if(n==1){
//			return false;
//		}
//		for(int i=2;i<=n/2;i++){
//			System.out.println(i);
//			if(n%i==0){
//				return false;
//			}
//		}
//		return true;
//	}
	public static boolean isEvenNumber(int n){
		if((n)%2==0){
			return true;
		}else
			return false;
}
}