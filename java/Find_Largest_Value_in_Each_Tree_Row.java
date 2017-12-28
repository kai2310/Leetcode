package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Find_Largest_Value_in_Each_Tree_Row {
	public List<Integer> largestValues(TreeNode root) {

		List<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		} else {
			Queue<TreeNode> elements = new LinkedList<TreeNode>();
			elements.add(root);
			int count = elements.size();
			while (count > 0) {
				int nextCnt = 0;
				int currentMax = Integer.MIN_VALUE;
				for(int i=0;i<count;i++) {
					TreeNode nextNode = elements.poll();
					currentMax = Math.max(currentMax, nextNode.val);
					if (nextNode.left != null) {
						elements.add(nextNode.left);
						nextCnt = nextCnt + 1;
					}
					if (nextNode.right != null) {
						elements.add(nextNode.right);
						nextCnt = nextCnt + 1;
					}
				}
				res.add(currentMax);
				count = nextCnt;
			}
			return res;
		}
	}
}
