package leetcode;

import java.awt.font.NumericShaper;
import java.util.Arrays;

public class Maximum_Product_of_Three_Numbers {
	public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length-1;
		if (nums[0] < 0 && nums[1] < 0) {
			if (nums[len] >= 0) {
				return Math.max(nums[0]*nums[1]*nums[len], nums[len]*nums[len-1]*nums[len-2]);
			} else {
				return nums[len]*nums[len-1]*nums[len-2];
			}
		} else {
			return nums[len]*nums[len-1]*nums[len-2];
		}
	}
}
