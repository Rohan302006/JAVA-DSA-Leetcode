class Solution 
{
    public int goodNodes(TreeNode root) 
    {
        return DFS(root, root.val);
    }

    public int DFS(TreeNode root, int max_so_far) 
    {
        if (root == null) 
        {
            return 0;
        }
        int count = 0;

        if (root.val >= max_so_far) 
        {
            count = 1;
        }
        max_so_far = Math.max(max_so_far, root.val);

        count += DFS(root.left, max_so_far);
        count += DFS(root.right, max_so_far);

        return count;
    }
}