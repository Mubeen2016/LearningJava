package inheritance;

public class Car extends Vehicle {
	private int wheels;
	private int door;
	private int gear;
	private boolean isManual;
	
	private int currentGear;

	public Car(String name, String size, int wheels, int door, int gear, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.door = door;
		this.gear = gear;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("car.setCurrentGear(): Changed to"+ this.currentGear+ "gear");
	}
	
	public void changeVelocity(int speed, int direction){
		move(speed, direction);
		System.out.println("Car.ChangedVelocity():Velocity" + speed + "direction" + direction);
	}
	
	
	
	
	
	
	
	
}
