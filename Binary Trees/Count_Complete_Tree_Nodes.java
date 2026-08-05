class Solution 
{
    public int countNodes(TreeNode root) 
    {
        if (root == null) 
        {
            return 0;
        }

        int lh = getLeftHeight(root);
        int rh = getRightHeight(root);

        if (lh == rh) 
        {
            int ans = (int) Math.pow(2, lh) - 1;
            return ans;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public int getLeftHeight(TreeNode root) 
    {
        TreeNode temp = root;
        int lh = 0;

        while (temp != null) 
        {
            temp = temp.left;
            lh++;
        }
        return lh;
    }

    public int getRightHeight(TreeNode root) 
    {
        TreeNode temp = root;
        int rh = 0;

        while (temp != null) 
        {
            temp = temp.right;
            rh++;
        }
        return rh;
    }
}