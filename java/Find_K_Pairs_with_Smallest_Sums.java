package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Find_K_Pairs_with_Smallest_Sums {
	public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<int[]> res = new ArrayList<int[]>();
		TreeMap<Integer, List<int[]>> candidates = new TreeMap<Integer, List<int[]>>();
		int sum = 0;
		for(int i=0;i<nums1.length;i++) {
			for(int j=0; j<nums2.length;j++) {
				sum = nums1[i] + nums2[j];
				int[] elems = new int[]{nums1[i], nums2[j]};
				if (candidates.containsKey(sum)) {
					List<int[]> value = candidates.get(sum);
					value.add(elems);
					candidates.put(sum, value);
				} else {
					List<int[]> value = new ArrayList<int[]>();
					value.add(elems);
					candidates.put(sum, value);
				}
			}
		}
		Set<Integer> keys = candidates.keySet();
		for(Integer key : keys) {
			for (int[] elem : candidates.get(key)) {
				if (res.size() == k) {
					break;
				} else {
					res.add(elem);
				}
			}
			if (res.size() == k) break;
		}
		return res;
	}
}
