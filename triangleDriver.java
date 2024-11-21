import java.util.Scanner;

//Jessika Wallace
public class triangleDriver {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int size = 0;
		int i;
		int j;
		char fill;
		char letter;
		boolean again = true;

		while (again == true) {
			System.out.print("Input the size:");
			size = scnr.nextInt();
			while (size < 1 || size > 50) {		// while loop that makes sure the size is between 1 and 50
				System.out.print("Enter a size between 1-50!\nInput the size: ");
				size = scnr.nextInt();
			}
			
			System.out.print("Input the fill:v");
			fill = scnr.next().charAt(0);
			scnr.nextLine();
			
			String both = fill + " ";			// turn fill character into a string and add a space
			
			for (i = 0; i < size; i++) {		// loop for the entire triangle
				for (j = i; j < size - 1; j++) {// loop for the spaces
					System.out.print(" ");
				}
				for (j = 0; j <= i; j++) {		// loop for fill
					System.out.print(both);
				}
				System.out.println();			// start next line of triangle
			}
			System.out.println("Would you like another triangle (Y/N)?");
			letter = scnr.next().charAt(0);			// takes the first character of user input

			if (letter == 'N' || letter == 'n') {
				again = false;					// if user says no, end the program
			} 
			else {
				again = true;					// if user says anything but no, continue the program
			}
		}
	}
}
