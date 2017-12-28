package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {
	public int subarraySum(int[] nums, int k) {
		int sum = 0;
		int result = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			if (map.containsKey(sum-k)) {
				result = result + map.get(sum-k);
			}
			if (!map.containsKey(sum)) {
				map.put(sum, 1);
			} else {
				int cnt = map.get(sum) + 1;
				map.put(sum, cnt);
			}
		}
		return result;
	}

}
