package javaProblems.countOcurrences;

public class Main {

	/*
	 * Write a program that counts the occurrences of a certain character in a given string.
	 */
	public static void main(String[] args) {

		String str = "Input String";
		System.out.println(countOcurrencesV1('t',str));
		System.out.println(countOcurrencesV2('t',str));
		
	}
	
	public static long countOcurrencesV1(char ch, String str) {
		return str.chars().filter(c -> (int)ch == c).count();
	}
	
	public static long countOcurrencesV2(char ch, String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++ ) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

}
