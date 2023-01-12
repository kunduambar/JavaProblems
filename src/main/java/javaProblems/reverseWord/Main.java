package javaProblems.reverseWord;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD";
		System.out.println(Strings.reverseWord(str));
		String sentence = "I am vicious";
		System.out.println(Strings.reverseSentence(sentence));
		System.out.println(Strings.reverseWords(sentence));
		System.out.println(Strings.reverseWordsJava8(sentence));
		System.out.println(Strings.plainReverse(sentence));
	}

}
