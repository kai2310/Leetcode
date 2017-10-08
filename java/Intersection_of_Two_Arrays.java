package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Intersection_of_Two_Arrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		
		if (nums1.length == 0 || nums2.length == 0) {
			return new int[0];
		} else {
			Set<Integer> elements = new HashSet<Integer>();
			
			Map<Integer, Integer> count = new HashMap<Integer, Integer>();
			
			for (int i=0;i<nums1.length;i++) {
				if (!count.containsKey(nums1[i])) {
					count.put(nums1[i], 1);
				}
			}
			
			for (int j=0;j<nums2.length;j++) {
				if (count.containsKey(nums2[j])) {
					elements.add(nums2[j]);
				}
			}
			
			int res[] = new int[elements.size()];
			int index = 0;
			
			for (int element : elements) {
				res[index++] = element;
				
			}
			return res;
		}
	}
}
