package learningConstructor;

public class Constructor {

	int length;
	int width;
	public void calculateArea(){
		int Area = length*width;
		System.out.println("Area of something " + Area);
	}
	
	public Constructor(){
		this.length = 6;
		this.width = 5;
		System.out.println("Constructor Fired");
	}
	public Constructor(int length, int width){
		this.length = length;
		this.width = width;
		System.out.println("Parameterized Constructor Fired");
	}
}
