package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Increasing_Subsequences {
	Set<List<Integer>> subsequences = new HashSet<List<Integer>>();
	public void generateSubsequences(int[] nums, int index, List<Integer> currentList) {
		if (index == nums.length) {
			if (currentList.size() > 1) {
				subsequences.add(currentList);
			}
			return;
		} else {
			if (currentList.size() > 0) {
				if (nums[index] >= currentList.get(currentList.size()-1)) {
					List<Integer> temp = new ArrayList<Integer>(currentList);
					currentList.add(nums[index]);
					generateSubsequences(nums, index+1, currentList);
					
					currentList = temp;
					generateSubsequences(nums, index+1, currentList);
				} else {
					generateSubsequences(nums, index+1, currentList);
				}
			} else {
				List<Integer> temp = new ArrayList<Integer>(currentList);
				currentList.add(nums[index]);
				generateSubsequences(nums, index+1, currentList);
				
				currentList = temp;
				generateSubsequences(nums, index+1, currentList);
			}
		}
	}
	public List<List<Integer>> findSubsequences(int[] nums) {
		generateSubsequences(nums, 0, new ArrayList<Integer>());
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		for(List<Integer> list : subsequences) {
			results.add(list);
		}
		return results;
	}
}
