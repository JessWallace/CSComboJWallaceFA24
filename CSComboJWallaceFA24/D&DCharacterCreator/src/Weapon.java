
public class Weapon {
	private String weaponName;
	private int addedDmg;
		
	public Weapon(String weaponName, int addedDmg) {
		this.weaponName = weaponName;
		this.addedDmg = addedDmg;
	}

	public Weapon() {
		this.weaponName = "";
		this.addedDmg = 0;
	}

	public String getWeaponName() {
		return weaponName;
	}

	public void setWeaponName(String weaponName) {
		 this.weaponName = weaponName;
	}

	public int getAddedDmg() {
		return addedDmg;
	}

	public void setAddedDmg(int addedDmg) {
		this.addedDmg = addedDmg;
	}

	@Override
	public String toString() {
		return "\nWeapon name:" + weaponName + ", \nWeapon Damage:" + addedDmg + "\n";
	}
	
// name, class, level, race, alignment
// roll for strength, dexterity, charisma, wisdom, intelligence, constitution,
// AC HP iniative , hit dice, spell slots,
// Inventory passive, skills, feats
}
