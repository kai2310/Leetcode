package leetcode;

public class Maximum_Average_Subarray_I {
	public double findMaxAverage(int[] nums, int k) {
		long sum = 0;
		for (int i=0;i<k;i++) {
			sum += nums[i];
		}
		
		long current = sum;
		
		for (int j=k;j<nums.length;j++) {
			sum += nums[j] - nums[j-k];
			current = Math.max(current, sum);
		}
		
		return current*1.0/k;
	}
}