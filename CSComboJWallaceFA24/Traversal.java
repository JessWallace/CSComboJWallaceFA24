import java.util.Scanner;

public class Traversal {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int i;
		int[] userNum;
		userNum = new int[100];
		
		
		
		System.out.println("Enter values (-1 to stop)");
		for(i = 0; i < userNum.length; i++) {
			
			System.out.print(": ");
			userNum[i] = scnr.nextInt();
			if(userNum[i] == -1) {
				break;
			}
		}
		System.out.println("Your values, reversed:");
		for(i = userNum.length -1; i > -1; --i) {
			if(userNum[i] == 0) {
				--i;
		} else if (userNum[i] == -1) {
		}else {
			System.out.println(userNum[i]);
			}
		}

	}

}
