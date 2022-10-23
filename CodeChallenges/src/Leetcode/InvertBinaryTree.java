package Leetcode;
/**
Definition for a binary tree node.
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
 * */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        //base case of recursion, when tree reaches no more element to transverse
        if (root==null){
            return null;
        }
        // create a tree for left side, traverse on the left
        TreeNode left = invertTree(root.left);
        // create a tree for right side, traverse on the right
        TreeNode right = invertTree(root.right);

        //when left or right side reaches base scenario, then it will compute the swap of current subtree
        root.left = right;
        root.right= left;

        return root;
    }

}
