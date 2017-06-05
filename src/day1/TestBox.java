package day1;

public class TestBox {

	public static void main(String[] args) {
		Box ups = new Box();
		ups.length = 5;
		ups.width = 5;
		int calculateArea = ups.calculateArea(5,6);
		System.out.println(calculateArea);
	}

}
