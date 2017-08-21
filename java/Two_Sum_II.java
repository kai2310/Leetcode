package leetcode;

public class Two_Sum_II {
	public int[] twoSum(int[] numbers, int target) {
       
		int[] res = new int[2];
		if (numbers.length == 2) {
			res[0] = 1;
			res[1] = 2;
		}
		int left = 0;
		int right = numbers.length -1;
		while (left < right) {
			int current = numbers[left] + numbers[right];
			if (current == target) {
				res[0] = left+1;
				res[1] = right+1;
				break;
			} else if (current < target) {
				left = left + 1;
			} else {
				right = right -1;
			}
		}
		return res;
    }

}
