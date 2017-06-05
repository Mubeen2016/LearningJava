package encapsulation;

public class EnhancedPlayer {

	private String hitPoints;
	private int health =100;
	private String weapon;
	public EnhancedPlayer(String name, int health, String weapon) {
		this.hitPoints = name;
		if(health>0 && health<=100){
			this.health = health;
		}
		this.weapon = weapon;
	}
	
	public void looseHealth(int damage){
		this.health = this.health-damage;
		if(this.health<=0){
			System.out.println("Player knockout.......");
		}
	}
	
	public int remainingHealth(){
		return health;
	}
	
	public String getName() {
		return hitPoints;
	}
	public int getHealth() {
		return health;
	}
	public String getWeapon() {
		return weapon;
	}
	
	
	
}
