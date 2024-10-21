import java.util.Scanner;

public class BeerMain {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int bottles;
		
		System.out.print("Enter the starting number of bottles: ");
		bottles = scnr.nextInt();

		for(int i = bottles; i > 0; --i){
			if(i == 2) {
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
			System.out.println("Take one down and pass it around, " + (i-1) + " bottle of beer on the wall.");
			System.out.println();
		}else if (i == 1) {
				System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
				System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
				System.out.println();
			}else {
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
			System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
			System.out.println();
				}
		}
		System.out.println("0 bottles of beer on the wall, 0 bottles of beer.");
		System.out.println("Go to the store and buy some more, " + bottles + " bottles of beer on the wall.");
	}
}

