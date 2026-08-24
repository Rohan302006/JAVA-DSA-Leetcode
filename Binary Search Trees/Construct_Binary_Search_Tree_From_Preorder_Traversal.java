class Solution 
{
    int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) 
    {
        return buildTree(preorder, Integer.MAX_VALUE);
    }

    private TreeNode buildTree(int[] preorder, int bound)
    {
        if (i >= preorder.length || preorder[i] > bound) 
        {
            return null;
        }

        TreeNode root = new TreeNode(preorder[i]);
        i++;

        root.left = buildTree(preorder, root.val);
        root.right = buildTree(preorder, bound);

        return root;
    }
}

/*
    Brute Force Easy to understand but TC = O(n^2)

    class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return build(preorder, 0, preorder.length - 1);
    }

    private TreeNode build(int[] preorder, int i, int j) {
        if (i > j) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[i]);

        int i = i + 1;

        while (i <= j && preorder[i] < root.val) {
            i++;
        }

        root.left = build(preorder, i + 1, i - 1);
        root.right = build(preorder, i, j);

        return root;
    }
}

*/