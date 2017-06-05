
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(4));
	}
	private static int factorial(int value){
		if(value==1){
			return 1;
		}
		return factorial(value-1)*value;
	}
}
