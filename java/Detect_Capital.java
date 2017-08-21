package leetcode;

public class Detect_Capital {
	public boolean detectCapitalUse(String word) {
		if (word.length() == 1) return true;
		boolean res = true;
		for(int i=0;i<word.length()-1;i++) {
			char first = word.charAt(i);
			char second = word.charAt(i+1);
			boolean isFirstCapital = first >= 'A' && first <= 'Z';
			boolean isSecondCapital = second >= 'A' && second <= 'Z';
			
			if (isFirstCapital && !isSecondCapital) {
				if (i != 0) {
					res = false;
					break;
				}
			}
			if (!isFirstCapital && isSecondCapital) {
				res = false;
				break;
			}
			
		}
		return res;
	}
}
