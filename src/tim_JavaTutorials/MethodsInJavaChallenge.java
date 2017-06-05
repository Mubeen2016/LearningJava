package tim_JavaTutorials;

public class MethodsInJavaChallenge {

	public static void main(String[] args) {
		int highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Mubeen", highScorePosition);
	}

	public static void displayHighScorePosition(String Player, int Position){
		System.out.println(Player +" " + "managed to get into position " +" " + Position + " " +"on the high score table");
	}
	
	public static int calculateHighScorePosition(int score){
		if(score > 1000){
			return 1;
		}else if(score >500 && score <1000){
			return 2;
		}else if(score >100 && score<500){
			return 3;
		}else{
			return 4;
		}
	}
}