
public class demo {
		public static void main(String[] args) {
			soldier ghost = new soldier();
			ghost.takeDamage(500);
			SuperSoldier boss = new SuperSoldier(3, 1000);
			System.out.println("The boss has recieved: "+ boss.takeDamage(500) + " Damages to repair get more lives");
		}

}