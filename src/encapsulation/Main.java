package encapsulation;

public class Main {

	public static void main(String[] args) {

		EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Mubeen",120,"sword" );
		//enhancedPlayer.looseHealth(50);
		System.out.println("Remaining health " + enhancedPlayer.remainingHealth());
	}

}
