package tim_JavaTutorials;

public class MethodsInJava {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 8;
		int bonus = 200;
		
		int result = calculateScore(gameOver,score,levelCompleted,bonus);
		System.out.println(result);
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
		if(gameOver){
			int finalScore = score + (levelCompleted*bonus);
			finalScore+=2000;
			System.out.println("Your final Score is :" + finalScore);
			return finalScore;
		}
		return -1;
	}
}
