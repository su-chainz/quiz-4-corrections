package quiz;

public class Inches {
	public static void main(String[] args) {
		Inches i = new Inches();
		System.out.println(i.inches(263323.32));
	}
	
	public String inches(double inches) {
			int miles = 0;
			int yds = 0;
			int feet = 0;
			for(int i = 0; i < Math.floor(inches / 63360); i++) {
				inches = inches - 63360;
				miles += 1;				
					}
			for(int i = 0; i < Math.floor(inches / 36); i++) {
				inches = inches - 36;
				yds += 1;
			}
			for(int i = 0; i < Math.floor(inches / 12); i++) {
				inches = inches - 12;
				feet += 1;
			}
			return miles + " miles, " + yds + " yards, " + feet + " feet, and " + Math.round(Math.floor(inches)) + " inches.";
	}
}
