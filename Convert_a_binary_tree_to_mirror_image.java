Write a function to convert a binary tree into its mirror image and return the root node of the mirrored tree.

public TreeNode mirror(TreeNode root) {

    if(root == null) return null;
    TreeNode curr = null;
    mirror(root.left);
    mirror(root.right);

    curr = root.left;
    root.left = root.right;
    root.right = curr;

    return root;
}
