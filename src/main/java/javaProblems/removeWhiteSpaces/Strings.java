package javaProblems.removeWhiteSpaces;

public class Strings {
	
	public static String removeWhiteSpaces(String str) {
		
		if(str == null || str.isBlank()) {
			return "";
		}
		return str.replaceAll("\\s", "");
	}

}
