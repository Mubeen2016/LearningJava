package tim_JavaTutorials;

public class WhileAndDoWhileLoop {

	public static void main(String[] args) {
		//boolean result =isEvenNumber(2);
		//System.out.println("Number is Even" +" "+ result);
		int count=0;
		for(int i=10; i<=60;i++){
			if(isEvenNumber(i)){
				System.out.println("Number is " + " "+i);
				count++;
			}
			if(count==10){
				System.out.println("Existing loop");
				break;
			}
		}
		System.out.println("Total even number found" + " " + count);
	}

	public static boolean isEvenNumber(int n) {
		for (int i = 2; i <n / 2; i++) {
			if (n % i == 0) {
				return true;
			}else if(n%i==1){
				return false;
			}
		}
		return false;
		
	}
}
