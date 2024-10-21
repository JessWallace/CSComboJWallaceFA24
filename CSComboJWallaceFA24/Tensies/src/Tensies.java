
import java.util.Random;
import java.util.Scanner;
public class Tensies {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int p1Games = 0;
		int p2Games = 0;
		char another = 'y';
		
	while(another == 'y') {	
		Scanner scnr = new Scanner(System.in);
		int i;
		int p1Num;
		int p2Num;
		int p1Score = 0;
		int p2Score = 0;
		int compDie;
		
		System.out.println("Player 1 pick a number:");
		p1Num = scnr.nextInt();
		System.out.println("Your number is: " + p1Num);
		System.out.println("Player 2 pick a number:");
		p2Num = scnr.nextInt();
		System.out.println("Your number is: " + p2Num);
		
		for (i= 0; i <10; ++i) {
			compDie = rand.nextInt(6)+1;
			if (p1Num == compDie) {
				p1Score++;
			}
			if (p2Num == compDie) {
				p2Score++;
			}
		}
		if (p1Score > p2Score) {
			System.out.println("Player 1 wins!");
			p1Games++;
		}
		else if (p1Score < p2Score) { 
			System.out.println("Player 2 wins!");
			p1Games++;
		}
		else {
			System.out.println("Draw!");
		}
		scnr.nextLine();
		System.out.println("Would you like to play again? y/n");
		String str = "yes";
		str = scnr.nextLine();
		another = str.charAt(0);
		if (another == 'n') {
			break;
		}
		}
	}
}
