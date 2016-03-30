/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        
        if(p == null && q != null) {
            return false;
        }
        if(q == null && p != null) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        
        else{
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}