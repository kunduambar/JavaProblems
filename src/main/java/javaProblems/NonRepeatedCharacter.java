package javaProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String problemString = "aaaaaaab";
		int nonRepeatedCharPos = -1;
		for(int i = 0 ; i < problemString.length(); i++) {
			int codePoint = problemString.codePointAt(i);
			
			long count = problemString.codePoints().filter
				(ch -> codePoint == ch).count();
			
			if(count == 1) {
				nonRepeatedCharPos = i;
				break;
			}
				
				
		}
		System.out.println("First non repeated String: " + problemString.substring(nonRepeatedCharPos, nonRepeatedCharPos+1));
		
		Map<Integer, Long> chs = problemString.codePoints().mapToObj(cp -> cp).collect(
				Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		int cp = chs.entrySet().stream().filter(e -> e.getValue() == 1L).findFirst().map(Map.Entry::getKey).orElse(Integer.valueOf(Character.MIN_VALUE));
		
		System.out.println(Character.toChars(cp));
		
	}

}
