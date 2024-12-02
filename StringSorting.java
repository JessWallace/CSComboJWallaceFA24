import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int num;
		// first ask the user how many strings they will enter
		System.out.print("Enter the number of strings: ");
		num = scnr.nextInt();
		scnr.nextLine();
		
		//create an array to hold the strings
		String[] arr = new String[num];
		
		//read in the strings using a scanner inside of a loop. The strings will not contain spaces
		for(int i = 0; i < num; ++i) {
			System.out.print("Enter a string: ");
			arr[i] = scnr.nextLine();
		}
		System.out.println();
		//write a function to sort the array using bubble sort.

		// the first output should be alphabetical
		bubbleSort(arr, num, true);
		System.out.println("Sorted:");
		for (String str: arr) {
			System.out.println(str);
		}
		System.out.println();
		// the second output should be reverse alphabetical
		bubbleSort(arr, num, false);
		System.out.println("Reverse sorted:");
		for (String str: arr) {
			System.out.println(str);
		}
		
	
	}
	static void bubbleSort(String[] arr, int n, boolean ascending) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare based on the order (ascending or descending)
                if ((ascending && arr[j].compareTo(arr[j + 1]) > 0) ||
                    (!ascending && arr[j].compareTo(arr[j + 1]) < 0)) {
                    // Swap strings
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}

