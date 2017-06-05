package tim_JavaTutorials;

public class IfCondition {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int score1 = 10000;
		int levelComplete = 5;
		int levelComplete1 = 8;
		int bonus = 100;
		int bonus1 = 200;
		
		if(gameOver){
			int finalScore= score + (levelComplete*bonus);
			System.out.println("Your final score is :"+finalScore);
			System.out.println("*************************************");
			int finalScore1 = score1 + (levelComplete1*bonus1);
			System.out.println("your final score1 is :"+ finalScore1);
		}
		
	}

}
