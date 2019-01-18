package quiz;

public class Odds {
	public static void main(String[] args) {
		Odds i = new Odds();
		System.out.println(i.oddsOnly("sdfsd"));
	}
	
	public String oddsOnly(String original) {
		String a = "";
		if (original == null) {
			return null;
		} else if (original == "") {
			return "";
		} else {
			int length = original.length();
				for (int i = 0; i < length; i = i + 2) {
					a = a + original.charAt(i);
				}
			return a;
			
		}
	}
	
}
