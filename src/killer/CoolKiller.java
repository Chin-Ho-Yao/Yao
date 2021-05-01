package killer;

public class CoolKiller implements Killer{
	Weapon weapon;
	
	public CoolKiller(Weapon weapon) {
		this.weapon = weapon;
		
		
	}
	
	
	public void kill() {
		// TODO Auto-generated method stub
		weapon.act();
	}
public static void main(String[] args) {
	Gun gun = new Gun();
	CoolKiller ck1 = new CoolKiller(gun);
	ck1.kill();
}
}
