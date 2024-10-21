import java.util.Scanner;
public class TicTacToe {

	public static void main(String[] args) {
		char [][] boxes = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
		int player = 1;  //player = player%2+1
		int box = 0;
		int turnCount = 0;
		Scanner input = new Scanner(System.in);
		
		drawBoard(boxes);
		

	}
	
	public static void drawBoard(char[][] boxes) {
		for (int i = 0; i < boxes.length; i++) {
			for (int j = 0; j < boxes.length; j ++) {
				if ((boxes[i][j]+2)%3 == 0) System.out.print(" ");
				System.out.print(boxes[i][j]);
				if ((boxes[i][j])%3 != 0) System.out.print(" | ");
			}
			if (i != 2)System.out.print("\n---------\n");
		}
		
	}

}
