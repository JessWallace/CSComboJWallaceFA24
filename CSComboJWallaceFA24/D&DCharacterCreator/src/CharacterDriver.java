//import java.util.Scanner;

import java.util.Random;

public class CharacterDriver {
	
	public static void main(String[] args) {
		Random rand = new Random();
		Character player1 = new Character(); //"Bilbo", "Hobbit", 250, 50
		Character player2 = new Character(); //"George", "Owl Bear", 250, 25
		int dmg = 0;
		
		player1 = Character.createChar(player1);
		player1.setWeapon("Sting", 35);
		player2 = Character.createChar(player2);
		player2.setWeapon("Claws", 20);
		
		System.out.println("\n"+ player1);
		System.out.println("\n"+ player2);
		while(player1.getHealth()>0 && player2.getHealth()>0) {
			int whoGoes = rand.nextInt(2);
			
			if(player1.getHealth()>0 && whoGoes == 0)
			dmg = player2.attack(player2.getStrength());
			player1.damage(dmg);
			System.out.println("" + player2.getName() + " attacks " + player1.getName() + " with a weapon!");
			System.out.println(player1);
			if(player2.getHealth()>0 && whoGoes == 1) {
			dmg = player1.attack(player1.getStrength());
			player2.damage(dmg);
			System.out.println("" + player1.getName() + " attacks " + player2.getName() + " with a weapon!");
			System.out.println(player2);}
		}

	}
		

	}	
