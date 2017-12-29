package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Find_K_Closest_Elements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> res = new ArrayList<Integer>();
		
		boolean isAscending = arr[0] <= arr[arr.length-1];
		
		int left = 0;
		int right = arr.length -1;
		
		while(left <= right && right-left+1 != k) {
			int leftClosed = Math.abs(arr[left] - x);
			int rightClosed = Math.abs(arr[right] - x);
			
			if (leftClosed < rightClosed) {
				right = right -1;
			}else if (leftClosed > rightClosed) {
				left = left + 1;
			} else {
				if (isAscending) {
					right = right-1;
				} else {
					left = left + 1;
				}
			}
		}
		
		if (isAscending) {
			for(int i=left; i<=right;i++) {
				res.add(arr[i]);
			}
		} else {
			for (int i=right;i>=left;i--) {
				res.add(arr[i]);
			}
		}
		return res;
	}
}
