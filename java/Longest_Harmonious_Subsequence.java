package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Longest_Harmonious_Subsequence {
	public int findLHS(int[] nums) {
		if (nums.length <= 1) return 0;
		
		int res = 0;
		Map<Integer, Integer> elems = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if (!elems.containsKey(nums[i])) {
				elems.put(nums[i], 1);
			} else {
				int count = elems.get(nums[i]) + 1;
				elems.put(nums[i], count);
			}
		}
		
		Set<Integer> keys = elems.keySet();
		for(Integer key : keys) {
			if (elems.containsKey(key-1)) {
				res = Math.max(res, elems.get(key) + elems.get(key-1));
			}
			if (elems.containsKey(key+1)) {
				res = Math.max(res, elems.get(key) + elems.get(key+1));
			}
		}
		
		if (res == nums.length) {
			return res-1;
		} else {
			return res;
		}
	}
}
