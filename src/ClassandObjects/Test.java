package ClassandObjects;

public class Test {

	public static void main(String[] args) {

		Example box = new Example();
		box.length = 10;
		box.width = 10;
		int area1 = box.CalculateArea(25,25);
		System.out.println("Area " +area1);
	}

}
