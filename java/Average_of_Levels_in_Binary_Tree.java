package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Average_of_Levels_in_Binary_Tree {
	public List<Double> averageOfLevels(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		List<Double> results = new ArrayList<Double>();
		queue.add(root);
		long count = 1;
		
		while(count > 0) {
			long times = 0;
			long sum = 0;
			for(long i=0;i<count;i++) {
				TreeNode node = queue.poll();
				sum = sum + node.val;
				if (node.left != null) {
					queue.add(node.left);
					times = times + 1;
				}
				if(node.right != null) {
					queue.add(node.right);
					times = times + 1;
				}
			}
			results.add(sum*1.0/count);
			count = times;
		}
		
		return results;
		
	}
}
