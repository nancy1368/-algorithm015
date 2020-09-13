class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //terminator
        if (root == null || root == p || root == q) return root;

        // process current logic

        //drill down
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null && right == null) return null;

        if (left == null) return right;

        if (right == null) return left;

        return root;

        //convert state
        
    }
}