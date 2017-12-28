package leetcode;

import java.util.HashMap;
import java.util.Map;


public class Continuous_Subarray_Sum {
	public boolean checkSubarraySum(int[] nums, int k) {
		if (nums.length < 2) return false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
			if (k != 0) sum = sum % k;
			if (map.containsKey(sum)) {
				int index = map.get(sum);
				if (i - index > 1)  return true;
			} else {
				map.put(sum, i);
			}
		}
		return false;
	}
}
