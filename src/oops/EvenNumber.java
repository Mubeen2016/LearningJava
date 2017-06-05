package oops;

public class EvenNumber {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 2; i <= 50; i++) {
			if (isEven(i)) {
				System.out.println("Number is Even Number" + i);
				count++;
				if (count == 10) {
					System.out.println("Existing loop");
					break;
				}
			}
		}
	}

	public static boolean isEven(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 0; i < n / 2; i++) {
			if (n % 2 == 0) {
				return true;
			}
		}
		return false;
	}
}
