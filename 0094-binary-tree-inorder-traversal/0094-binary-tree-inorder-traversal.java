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
     public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> al= new ArrayList<>();
        if (root==null) return al;
        return inorderTraversal(root,al);
    }
    public static List<Integer> inorderTraversal(TreeNode root,ArrayList<Integer> al){
          if (root!=null){
              inorderTraversal(root.left, al);
              al.add(root.val);
              inorderTraversal(root.right, al);
          }
          return al;
    }
}