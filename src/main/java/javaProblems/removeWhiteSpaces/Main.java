package javaProblems.removeWhiteSpaces;

import java.util.concurrent.TimeUnit;

public class Main {

	private static final String TEXT = 
			" Provided Str \r \t \n without spaces";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input text: \n" + TEXT + "\n");
		System.out.println("replaceAll() solution:");
		long startTime = System.nanoTime();
		String result = Strings.removeWhiteSpaces(TEXT);
		long endTime = System.nanoTime();
		printExecutionTime(endTime - startTime);
		System.out.println("string without blanks: " + result);
	}
	
	private static void printExecutionTime(long executionTime) {
		System.out.println("Execution Time: " + executionTime + " ns" + " ("
				+ TimeUnit.MILLISECONDS.convert(executionTime, TimeUnit.NANOSECONDS) + " ms)");
	}
}
