class Solution 
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> ans = new ArrayList<>();

        PreOrder(root, ans);
        return ans;
    }

    private void PreOrder(TreeNode root, List<Integer> ans) 
    {
        if (root == null) 
        {
            return;
        }

        ans.add(root.val);

        PreOrder(root.left, ans);
        PreOrder(root.right, ans);
    }
}