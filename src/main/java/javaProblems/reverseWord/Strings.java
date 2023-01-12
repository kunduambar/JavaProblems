package javaProblems.reverseWord;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Strings {

	public static String reverseWord(String str) {
		
		char[] charArr = str.toCharArray();
		for(int i = 0; i < str.length() / 2 ; i++) {
			char tmp = charArr[i];
			charArr[i] = charArr[str.length() -1 -i];
			charArr[str.length() -1 -i]	= tmp;	
		}
		return new String(charArr);
	}
	
	public static String reverseSentence(String str) {
		String[] strArr = str.split(" ");
		String[] reveStrArr = new String[strArr.length];
		for(int i = 0 ; i < strArr.length ; i++) {
			reveStrArr[i] = reverseWord(strArr[i]);
		}
		return String.join(" ", reveStrArr);
	}
	
	private static final String WHITESPACE = " ";
	
	public static String reverseWords(String str) {

	 String[] words = str.split(WHITESPACE);
	 StringBuilder reversedString = new StringBuilder();

	 for (String word: words) {
	   StringBuilder reverseWord = new StringBuilder();

	   for (int i = word.length() - 1; i >= 0; i--) {
	     reverseWord.append(word.charAt(i));
	   }

	   reversedString.append(reverseWord).append(WHITESPACE);
	 }

	 return reversedString.toString();
	}
	private static final Pattern PATTERN = Pattern.compile(" +");
	public static String reverseWordsJava8(String str) {
		String revString =  PATTERN.splitAsStream(str)
	    .map(w -> new StringBuilder(w).reverse())
	    .collect(Collectors.joining(" "));
		return revString.toString() ;
	}
	public static String plainReverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
}
