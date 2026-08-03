class Solution 
{
    public int maxLevelSum(TreeNode root) 
    {
        int maxSum = Integer.MIN_VALUE;
        int resultLevel = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        int currLevel = 1;
        q.offer(root);

        while (q.size() > 0) 
        {
            int n = q.size();
            int sum = 0;

            while (n-- > 0) 
            {
                TreeNode temp = q.poll();
                sum += temp.val;

                if (temp.left != null) 
                {
                    q.offer(temp.left);
                }

                if (temp.right != null) 
                {
                    q.offer(temp.right);
                }
            }
            
            if (sum > maxSum) 
            {
                maxSum = sum;
                resultLevel = currLevel;
            }
            
            currLevel++;
        }
        return resultLevel;
    }
}