package leetcode;

public class Find_Pivot_Index {
	public int pivotIndex(int[] nums) {
		if (nums.length == 0) {
			return -1;
		} else if (nums.length == 1) {
			return 0;
		} else {
			int total = 0;
			for(int i=0;i<nums.length;i++) {
				total += nums[i];
			}
			
			int currentSum = 0;
			int res = -1;
			for (int i=0;i<nums.length;i++) {
				if (total - currentSum - nums[i] == currentSum) {
					res = i;
					break;
				} else {
					currentSum += nums[i];
				}
			}
			return res;
		}
	}
}
