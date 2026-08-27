class Solution {      // O(nlogn) easy brute force
    List<Integer> list = new ArrayList<>();
    int index = 0;

    public void recoverTree(TreeNode root) {
        inorder(root);
        Collections.sort(list);
        index = 0;
        restoreTree(root);
    }

    private void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    private void restoreTree(TreeNode root) {
        if (root == null)
            return;
        restoreTree(root.left);
        root.val = list.get(index);
        index++;
        restoreTree(root.right);
    }
}

/*  Better approach medium difficulty

    class Solution {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;

    public void recoverTree(TreeNode root) {
        inorder(root);

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (prev != null && prev.val > root.val) {
            if (first == null) {
                first = prev;
            }

            second = root;
        }

        prev = root;

        inorder(root.right);
    }
}

 */


 /*     Optimal Morris Traversal Algorithm  (Difficult)
 
    class Solution {

    public void recoverTree(TreeNode root) {

        TreeNode first = null;
        TreeNode second = null;
        TreeNode prev = null;

        TreeNode curr = root;

        while (curr != null) {

            if (curr.left == null) {

                Visit curr
                if (prev != null && prev.val > curr.val) {
                    if (first == null) {
                        first = prev;
                    }

                    second = curr;
                }

                prev = curr;
                curr = curr.right;

            } else {

                Find inorder predecessor
                TreeNode predecessor = curr.left;

                while (predecessor.right != null &&
                    predecessor.right != curr) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {

                    Create thread
                    predecessor.right = curr;
                    curr = curr.left;

                } else {

                    Remove thread
                    predecessor.right = null;

                    Visit curr
                    if (prev != null && prev.val > curr.val) {
                        if (first == null) {
                            first = prev;
                        }

                        second = curr;
                    }

                    prev = curr;
                    curr = curr.right;
                }
            }
        }

        Swap the two incorrect values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}

 */