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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root;

        while(temp != null) {
            if(val == temp.val) {
                break;
            }
            if(val < temp.val) {
                temp = temp.left;
            }

            else if(val > temp.val) {
                temp = temp.right;
            }
        }

        if(temp == null) {
            return null;
        }

        return temp;
    }
}