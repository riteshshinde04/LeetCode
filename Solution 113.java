class Solution {
    int val = 0;
    public TreeNode bstToGst(TreeNode root) {
        if (root.right != null) bstToGst(root.right);
        val = root.val = val + root.val;
        if (root.left != null) bstToGst(root.left);
        return root;
    }
}