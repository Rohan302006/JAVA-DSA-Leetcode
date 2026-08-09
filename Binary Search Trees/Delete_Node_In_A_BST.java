class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        else {
            // if Node has no left child we do
            if (root.left == null) {
                return root.right;
            }

            // Similarly if Node has no right child we do
            if (root.right == null) {
                return root.left;
            }

            // if Node has two childrens we Find smallest node in right subtree
            TreeNode temp = root.right;

            while (temp.left != null) {
                temp = temp.left;       // Go to left to find small
            }

            root.val = temp.val;
            root.right = deleteNode(root.right, temp.val);
        }
        return root;
    }
}