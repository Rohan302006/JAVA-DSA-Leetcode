class Solution 
{
    public TreeNode sortedArrayToBST(int[] nums) 
    {
        return constructTree(nums, 0, nums.length - 1);
    }

    public TreeNode constructTree(int[] nums, int left, int right) 
    {
        // it denotes no elements
        if (left > right) 
        {
            return null;
        }

        // we will find the middle repeatedly.  (break the array into left and right part)
        int mid = left + (right - left) / 2;
        
        // Then the middle element will become the root of the subtree 
        TreeNode root = new TreeNode(nums[mid]);

        // we will construct the left part using simple recursion 
        root.left = constructTree(nums, left, mid - 1);

        // same we construct the right part
        root.right = constructTree(nums, mid + 1, right);

        return root;
    }
}