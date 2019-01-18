package quiz;

public class Coins {
	public static void main(String[] args) {
		Coins c = new Coins();
		System.out.println(c.coins(0.70));
	}
	
	public int coins(double change) {
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		change = change * 100;
		double total = change;
		for(int i = 0; i < Math.floor(change / 25); i++) {
			total = total - 25;
			quarters += 1;				
				}
		for(int i = 0; i < Math.floor((change - quarters * 25) / 10); i++) {
			total = total - 10;
			dimes += 1;
		}
		for(int i = 0; i < Math.floor((change - quarters * 25 - dimes * 10) / 5); i++) {
			total = total - 5;
			nickels += 1;
		}
		for(int i = 0; i < (change - quarters * 25 - dimes * 10 - nickels * 5) / 1; i++) {
			total = total - 1;
			pennies += 1;
		}
		return quarters + dimes + nickels + pennies;
	}
}
