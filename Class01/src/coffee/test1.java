package coffee;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "aBcDeFg";
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			
			if (Character.isLowerCase(c)) {
				result += Character.toUpperCase(c);
				
			} else if(Character.isUpperCase(c)) {
				result += Character.toLowerCase(c);
			
			}
		}

		System.out.println(result);
	}

}
