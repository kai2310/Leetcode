package leetcode;

public class Single_Element_in_a_Sorted_Array {
	public int singleNonDuplicate(int[] nums) {
		int start = 0;
		int end = nums.length/2;
		
		while(start < end) {
			int pos = (start+end)/2;
			if (nums[2*pos] != nums[2*pos+1]) end = pos;
			else start = pos+1;
		}
		return nums[2*start];
	}
}