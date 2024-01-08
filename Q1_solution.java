/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){ // base condition, where the recursion need to stop
            return 0;
        }
        int curr = (root.val >= low && root.val <= high) ? root.val : 0; // if value is in the required range include it
        int leftSum = rangeSumBST(root.left, low, high); // check for left and right subtree
        int rightSum = rangeSumBST(root.right, low, high);
        
        
        
        return curr + leftSum + rightSum; // return the final calculated sum
    }
}
