package oops;

public class Employee {
	private double salary;
	private double bonus;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if(salary>=40000&& salary<=75000){
			this.salary = salary;
		}else{
			System.out.println("please check the salary");
		}
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if(bonus>=10000&&bonus<=20000){
			this.bonus = bonus;
		}else{
			System.out.println("please check the bonus");
		}
		this.bonus = bonus;
	}

	void calculateTotalPay(){
		double totalpay = salary+bonus;
		System.out.println(totalpay);
	}
}
