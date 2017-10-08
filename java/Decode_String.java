package leetcode;

import java.util.Stack;

public class Decode_String {
	public String decodeString(String s) {
		Stack<String> elements = new Stack<String>();
		
		for(int i=0;i<s.length();i++) {
			if (s.charAt(i) != ']') {
				elements.push(String.valueOf(s.charAt(i)));
			} else {
				String str = elements.peek();
				String current = "";
				while (!str.equals("[") && elements.size() > 0) {
					current = str + current;
					elements.pop();
					str = elements.peek();
				}
				elements.pop();
				String number = elements.peek();
				String times = "";
				while(number.charAt(0) >= '0' && number.charAt(0) <= '9' && elements.size() > 0) {
					times = number + times;
					elements.pop();
					if (elements.size() > 0) number = elements.peek();
				}
				String temp="";
				for (int j=0;j<Integer.valueOf(times);j++) {
					temp = temp + current;
				}
				elements.push(temp);
			}
		}
		String result = "";
		while(elements.size() > 0) {
			result = elements.pop() + result;
		}
		return result;
	}
}
