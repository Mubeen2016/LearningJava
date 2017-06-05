package oops;

public class Switch {

	public static void main(String[] args) {
		String name = "ali";
		switch(name){
		case "Mubeen":
			System.out.println("Name Mubeen is Matched");
			break;
		case "Mohammed":
			System.out.println("Name Mohammed is Matched");
			break;
		case "mubeen":
			System.out.println("Name mubeen is Matched");
			break;
		case "Azfar":
			System.out.println("Name Azfar is Matched");
			break;
		case "Ali":
			System.out.println("Name Ali is Matched");
			break;
		default:
			System.out.println("No name match found");
			break;
		}
		
	}

}
