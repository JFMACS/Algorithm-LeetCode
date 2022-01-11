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
    public int closestValue(TreeNode root, double target) {
        double minDif = Math.abs(root.val - target);
        int value = root.val;
        boolean over = false;
        while (root.left != null || root.right != null) {
            if(root.val > target) {
                if(root.left != null) {
                    root = root.left;
                } else {
                    over = true;
                }
            }else {
                if(root.right != null) {
                    root = root.right;
                } else {
                    over = true;
                }
            }
            if(Math.abs(root.val - target) < minDif) {
                minDif = Math.abs(root.val - target);
                value = root.val;
            }
            if(over) {
                break;
            }
        }
        return value;
    }
}