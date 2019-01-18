package quiz;

public class Evens {
	public static void main(String[] args) {
		Evens i = new Evens();
		System.out.println(i.evensOnly(""));
	}
	
	public String evensOnly(String original) {
		String a = "";
		if (original == null) {
			return null;
		} else if (original == "") {
			return "";
		} else {
			int length = original.length();
				for (int i = 1; i < length; i = i + 2) {
					a = a + original.charAt(i);
				}
			return a;
			
		}
	}
	
}
