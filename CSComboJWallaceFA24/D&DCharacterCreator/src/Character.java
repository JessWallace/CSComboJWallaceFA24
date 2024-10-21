import java.util.Random;
import java.util.Scanner;

public class Character {
	public static Scanner input = new Scanner(System.in);
	private Random rand= new Random();
	private String name;
	private String type;
	private int health;
	private int strength;
	private Weapon weapon;

	
	public Character() {
		super();
		this.name = "";
		this.type = "";
		this.health = 0;
		this.strength = 0;
	}

	public Character(String name, String type, int health, int strength) {
		super();
		this.name = name;
		this.type = type;
		this.health = health;
		this.strength = strength;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	static Character createChar(Character enemy) {	
		
		System.out.println("Enter your character's name:");
		String name = input.nextLine();
		enemy.setName(name);
		
		System.out.println("Enter your character's class:");
		String type = input.nextLine();
		enemy.setType(type);
		
		System.out.println("Enter your character's health:");
		int health = input.nextInt();
		enemy.setHealth(health);
		
		System.out.println("Enter your character's strength:");
		int strength = input.nextInt();
		enemy.setStrength(strength);
		input.nextLine();
		return enemy;
	}

	
	
	public Weapon getWeapon() {
		return weapon;
	}

	
	public void setWeapon(String string, int dmg) {
		//String tool="";
		this.weapon = new Weapon(string, dmg);
	}
	

	@Override
	public String toString() {
		String rtrn =
		 "Character \nName:" + name + ", \nType:" + type + ", \nHealth:" + health + ", \nStrength:" + strength + ".";
		if(weapon!= null) rtrn += this.weapon;
		return rtrn;
	}
	public int attack(int strength) {
		
		return strength * ((rand.nextInt(4)+1)) + weapon.getAddedDmg();
	}
	public int damage(int dmg) {
		this.health = this.health - dmg;
		return health;
	}
	
}
