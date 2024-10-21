import java.util.Scanner;

public class IOChecksheet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;	
		System.out.println("Enter a phrase.");
		word = input.nextLine();
		//this works for whitespace
		System.out.println("Here is the phrase: " + word.toUpperCase());
		
		//int intNum; //This does not accept decimal numbers. Only whole numbers.
		//System.out.println("Enter a number");
		//intNum = input.nextInt();
		//System.out.println("The number is: " + intNum);
		
		//float realNum = 987654321987654321.987654321f; 
		//realNum = (realNum + realNum);
		//System.out.println("Enter a real number.");
		//realNum = input.nextFloat();
		//System.out.println("The real number is: " + realNum);
		
		//double biggerRealNum;
		//biggerRealNum = 987654321.987654321;
		//biggerRealNum = biggerRealNum + biggerRealNum;
		//System.out.println(biggerRealNum);
		//System.out.println("Enter a monetary value.");
		//biggerRealNum = input.nextDouble();
		//System.out.printf("$%.2f", biggerRealNum);
		
		//char letter; //This holds one letter instead of a string
		//System.out.println("Enter a special character:");
		//letter = input.next().charAt(0);
		//System.out.println("The special character is: " + letter);
	}

}
