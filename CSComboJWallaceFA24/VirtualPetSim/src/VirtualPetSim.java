import java.util.Scanner;

public class VirtualPetSim {
	static int hunger = 5;
	static int energy = 5;
	static int happiness = 5;
	static int next = -1;
	static Scanner input = new Scanner(System.in);
	static boolean death = false;
	static String name;
	static int points = 0;
	static boolean godhood = false;

	public static void main(String[] args) {

		System.out.println("What is your pet's name?");
		name = input.next();
		while (death == false && godhood == false) {
			System.out.println("\nName: " + name + "\nHunger: " + hunger + "/10\nEnergy: " + energy + "/10\nHappiness: "
					+ happiness + "/10\nPoints: " + points);
			System.out.print(" 1. Feed\n 2. Sleep\n 3. Play\nWhat would you like to do with " + name + "?: ");
			next = input.nextInt();
			while ((next < 1 || next > 3) && next != 7) {
				System.out.print("Invalid choice.\n1. Feed\n 2. Sleep\n 3. Play\nWhat would you like to do with " + name
						+ "?: ");
				next = input.nextInt();
			}
			doResponse(next);
			checkWarning();
			death = checkDeath();
			godhood = checkGodhood();
		}
	}

	public static void doResponse(int next) {
		if (next == 1) {
			hunger += 3;
			energy--;
			happiness--;
			points++;
			System.out.println("\nYou and " + name + " shared a lovely charceutarie board!");
		} else if (next == 2) {
			energy += 3;
			hunger--;
			happiness--;
			points++;
			System.out.println("\nYou and " + name + " took a nice nap together!");
		} else if (next == 3) {
			happiness += 3;
			energy--;
			hunger--;
			points++;
			System.out.println("\nYou and " + name + " went to the park and played on the slides!");
		} else if (next == 7) {
			System.out.print("You've enter the debug console. \nHunger = " + hunger + ". New hunger value?: ");
			hunger = input.nextInt();
			System.out.print("Energy = " + energy + ". New energy value?: ");
			energy = input.nextInt();
			System.out.print("Happiness = " + happiness + ". New happiness value?:");
			happiness = input.nextInt();
			System.out.print("Points: " + points + ". New points value?:");
			points = input.nextInt();
		}
	}

	public static void checkWarning() {
		if (hunger <= 1) {
			System.out.println(name + " is very hungry.");
		} else if (hunger <= 2) {
			System.out.println(name + " is hungry.");
		}
		if (energy == 1) {
			System.out.println(name + " is very tired.");
		} else if (energy <= 2) {
			System.out.println(name + " is tired.");
		}
		if (happiness == 1) {
			System.out.println(name + " is very sad.");
		} else if (happiness <= 2) {
			System.out.println(name + " is sad.");
		}
	}

	public static boolean checkDeath() {
		if (hunger <= 0 && energy <= 0 && happiness <= 0) {
			System.out.println(name + " died out of sheer neglect.");
			return true;
		}
		if (hunger <= 0 && energy <= 0) {
			System.out.println(name + " died of starvation and exhaustion.");
			return true;
		}
		if (hunger <= 0 && happiness <= 0) {
			System.out.println(name + " died of starvation and a broken heart.");
			return true;
		}
		if (energy <= 0 && happiness <= 0) {
			System.out.println(name + " died of exhaustion and a broken heart.");
			return true;
		}
		if (hunger <= 0) {
			System.out.println(name + " died of starvation.");
			return true;
		}
		if (energy <= 0) {
			System.out.println(name + " died of exhaustion.");
			return true;
		}
		if (happiness <= 0) {
			System.out.println(name + " died of a broken heart.");
			return true;
		}

		if (hunger >= 15) {
			System.out.println(name + " stomache exploded! They died from over feeding.");
			return true;
		} else if (hunger > 10) {
			System.out.println(name + " is getting so full they might burst!");
		} else if (hunger == 10) {
			System.out.println(name + " is full.");
		}

		if (energy >= 15) {
			System.out.println(
					name + "'s muscles atrophied beyond repair and they whithered away. They died from over sleeping.");
			return true;
		} else if (energy > 10) {
			System.out.println(name + " is sleeping a concerning amount.");
		} else if (energy == 10) {
			System.out.println(name + " is well rested.");
		}

		if (happiness >= 15) {
			System.out.println(name + " is feeling so loved.");
		} else if (happiness > 10) {
			System.out.println(name + " is getting excited!");
		} else if (happiness == 10) {
			System.out.println(name + " is having the best day ever!");
		}
		return death;
	}

	public static boolean checkGodhood() {
		if (hunger >= 10 && energy >= 10 && happiness >= 50) {
			System.out.println(name
					+ " loves you so much and was so well cared for, they ascended mortality and will stay with you until the end of time. YOU WIN!");
			return true;
		}
		return false;
	}
}

//  (\/)
//  (..)
// c(")(")
u
