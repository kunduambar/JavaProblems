package javaProblems.countVowels;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aeiou";
		countVowels(str);
	}
	
	public static void countVowels(String str) {
		int countVowels =0;
		int countConsonants = 0 ;
		String lowercase = str.toLowerCase();
		String vowelPattern = "[aeiou]";
		String consonantPattern = "[a-z]";
		for(int i = 0; i < lowercase.length(); i++) {
			char ch = lowercase.charAt(i);
			if((""+ch).matches(vowelPattern)) {
				countVowels++;
			}else if((""+ch).matches(consonantPattern)) {
				countConsonants++;
			}	
		}
		System.out.println("Vowel count = " + countVowels);
		System.out.println("Consonant count = " + countConsonants);
	}

}
