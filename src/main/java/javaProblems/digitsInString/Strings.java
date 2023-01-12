package javaProblems.digitsInString;

public class Strings {
	
	public static boolean isOnlyDigitString(String str) {
		boolean isOnlyDigitString = true;
		for(int i = 0; i < str.length() ; i++) {
			if((int)str.charAt(i) < 48 || (int)str.charAt(i) > 57) {
				isOnlyDigitString = false;
			}
		}
		return isOnlyDigitString;
	}
	
	public static boolean isOnlyDigitStringJava8(String str) {
		return str.chars().anyMatch(i -> i < 48 || i > 57);
	}
	
	public static boolean isOnlyDigitString2(String str) {
		boolean isOnlyDigitString = true;
		for(int i = 0; i < str.length() ; i++) {
			if(!Character.isDigit(str.charAt(i))) {
				isOnlyDigitString = false;
				break;
			}
		}
		return isOnlyDigitString;
	
	}

}
