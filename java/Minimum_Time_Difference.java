package leetcode;

import java.util.Arrays;
import java.util.List;

public class Minimum_Time_Difference {
	public int findMinDifference(List<String> timePoints) {
		int converted[] = new int[timePoints.size()];
		int count = 0;
		int total = 24 *60;
		for (String timePoint : timePoints) {
			String elems[] = timePoint.split(":");
			
			int value = Integer.valueOf(elems[0]) *60 + Integer.valueOf(elems[1]);
			
			converted[count++] = value;
		}
		
		Arrays.sort(converted);
		
		int minMinute = total;
		int len = converted.length-1;
		
		for(int i=0;i<=len-1;i++) {
			int first = converted[i];
			int second = converted[i+1];
			
			minMinute = Math.min(minMinute, Math.min(Math.abs(second-first), total-Math.abs(second-first)));
		}
		
		return Math.min(minMinute, Math.min(Math.abs(converted[len]-converted[0]), total-Math.abs(converted[len]-converted[0])));
	}
}
