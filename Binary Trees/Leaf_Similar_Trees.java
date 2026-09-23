class Solution 
{
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        dfs(root1, l1);
        dfs(root2, l2);

        return l1.equals(l2);
    }

    public void dfs(TreeNode root, List<Integer> ans) 
    {
        if (root != null) 
        {
            if (root.left == null && root.right == null) 
            {
                ans.add(root.val);
            }

            dfs(root.left, ans);
            dfs(root.right, ans);
        }
    }
}