/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root != null) {
            exchange(root);
        }
        return root;
    }
    
    private void exchange(TreeNode t) {
        TreeNode temp = t.left;
        t.left = t.right;
        t.right = temp;
        
        if(t.left != null) {
            exchange(t.left);
        }
        if(t.right != null) {
            exchange(t.right);
        }
    }
}