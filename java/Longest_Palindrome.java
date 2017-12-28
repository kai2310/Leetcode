package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Longest_Palindrome {
	public int longestPalindrome(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				int count = map.get(s.charAt(i)) + 1;
				map.put(s.charAt(i), count);
			}
		}
		int res = 0;
		Set<Character> keys = map.keySet();
		for(Character key : keys) {
			if(map.get(key) % 2 == 1) {
				res = res + map.get(key) - 1;
			} else {
				res = res + map.get(key);
			}
		}
		if (res < s.length()) res = res + 1;
		return res;
	}
}
