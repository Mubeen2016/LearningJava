
public class ExampleWhile {
 
	public static void main(String[] args) {
		int[][] TwoDim = new int [4][3];
		int temp = 10;
		for(int i=0; i<4; i++){
			for(int j=0; j<3; j++){
				TwoDim[i][j]=temp;
				System.out.print(TwoDim[i][j] + " ");
				temp=temp+10;
				
				
			}
			System.out.println();
		}
	}
}
