import java.util.*;

public class SymmetricTree {


      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }


        public boolean isSymmetric(TreeNode root) {
            if (root==null) return true;
            return isSymmetric(root.left,root.right);
        }
        public static boolean isSymmetric(TreeNode root1,TreeNode root2){
          if (root1==null && root2==null) return true;
          if (root1==null || root2==null) return false;
          if (root1.val!=root2.val) return false;
          return isSymmetric(root1.left,root2.right) && isSymmetric(root1.right,root2.left);
        }

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
    public static int maxDepth(TreeNode root) {
        if (root==null) return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return Math.max(left,right)+1;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0) return null;
        int mid=nums.length/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return root;

    }



    public static void main(String[] args) {

    }
}
