import java.util.Scanner;

public class Sand {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// String word; // User input word
		// char numLetter; // computer translates character integer
		// int numWord; // computer finds integer of the number of characters

		// System.out.println("Enter a single word: ");
		// word = scnr.next();
//		String str = "Hello world!";
	//	int len = str.length();
		//String upper = str.toUpperCase(); // this is important so you don't have to make all variables of spelling like
											// YES and yes.
//		String sub = str.substring(1, 9); // index is between locations in string.
//		String sub2 = str.substring(6); // this will show everything after line 6
//		String sub3 = str.substring(7, 9); // negative numbers can't work.
//		int num = 13;
//		int num2 = 2;
//		String num3 = "3";
//		String sentence = "We are all \"Students\" so we are all learning."; // \" is called an escape key to make " show up.

		
//		System.out.println(str + " is " + len + " characters long.");
//		System.out.println(str + " in all caps: " + upper);
	//	System.out.println(sub);
//		System.out.println(str.concat(sub3.concat(sub2)));//this is a more efficient way to write +
//		System.out.println(sub2);
//		System.out.println(num + "" +num2 + num3); // this will just press the numbers together.

//		System.out.println(str.charAt(6)); // this can be used if the input is y and it only grabs the first letter so
											// yes doesn't break it.
//		System.out.println(str.indexOf("or"));//this outputs the location of "o". This can be used to find misspelled words.
		
		
		int dogYears = 3;
				switch (dogYears) {
				case 0 :
					System.out.println("Puppers!");
					break;
				case 1:
					System.out.println("Adolescent");
					break;
				case 2:
					System.out.println("Teenager");
					break;
					default:
						System.out.println("Adult!");
				}
				
	}
}
