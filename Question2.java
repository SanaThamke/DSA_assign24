package assignment24;

import java.util.HashSet;
import java.util.Set;

public class Question2 {
	
	public static void main(String[] args) {
		String string = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(string));
	}

	private static int lengthOfLongestSubstring(String s) {
		Set<Character> set=new HashSet<>();
		int end=0;
		int start=0;
		int maxLength = 0;
		
		while(start<s.length()) {
			if(!set.contains(s.charAt(start))) {
				set.add(s.charAt(start));
				maxLength=Math.max(maxLength, start-end+1);
				start++;
			}else {
				set.remove(s.charAt(end));
				end++;
			}
		}
		
		return maxLength;
	}

}
