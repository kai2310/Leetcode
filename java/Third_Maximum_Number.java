package leetcode;

public class Third_Maximum_Number {
	public int thirdMax(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		} else {
			
			int firstMax = Integer.MIN_VALUE;
			for (int i=0;i<nums.length;i++) {
				firstMax = Math.max(firstMax, nums[i]);
			}
			int firstMaxCount = 0;
			int secondMax = Integer.MIN_VALUE;
			for (int i=0;i<nums.length;i++) {
				if (firstMax == nums[i]) {
					firstMaxCount = firstMaxCount + 1;
				} else {
					secondMax = Math.max(secondMax, nums[i]);
				}
			}
			
			if (firstMaxCount == nums.length) return firstMax;
			
			int secondMaxCount = 0;
			int res = Integer.MIN_VALUE;
			for(int i=0;i<nums.length;i++) {
				if (nums[i] == firstMax) {
					continue;
				} else if (nums[i] == secondMax) {
					secondMaxCount = secondMaxCount + 1;
				} else {
					res = Math.max(res, nums[i]);
				}
			}
			
			if (firstMaxCount + secondMaxCount == nums.length) {
				return firstMax;
			} else {
				return res;
			}
		}
	}
}
