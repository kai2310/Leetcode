package leetcode;

public class Path_Sum {
	boolean isEqual = false;
	public void hasSumInTree(TreeNode root, int sum, int current) {
		if (isEqual) return;
		if (root.left != null && root.right == null) {
			hasSumInTree(root.left, sum, current + root.val);
		} else if (root.left == null && root.right != null) {
			hasSumInTree(root.right, sum, current + root.val);
		} else if (root.left != null && root.right != null) {
			hasSumInTree(root.left, sum, current + root.val);
			hasSumInTree(root.right, sum, current + root.val);
		} else {
			if (current + root.val == sum) isEqual = true;
			return;
		}
	}
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) return false;
		if (root.left == null && root.right == null) {
			return root.val == sum;
		}
		hasSumInTree(root, sum, 0);
		return isEqual;
	}
}
