package oops;

public class TestEmployee {

	public static void main(String[] args) {
		Employee alex = new Employee();
		alex.setSalary(65000); 
		alex.setBonus(11000);
		System.out.println(alex.getSalary());
		alex.calculateTotalPay();

	}

}
