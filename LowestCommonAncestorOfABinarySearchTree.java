/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LowestCommonAncestorOfABinarySearchTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode node = root;
		if(node.val>p.val && node.val<q.val)
			return node;
		else if(node.val>p.val && node.val>q.val)
			return lowestCommonAncestor(node.left,p,q);
		else if(node.val<p.val && node.val<q.val)
			return lowestCommonAncestor(node.right,p,q);

		return node;
        
    }
}