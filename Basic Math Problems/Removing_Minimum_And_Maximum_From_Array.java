class Solution 
{
    public int minimumDeletions(int[] nums) 
    {
        int n = nums.length;
        if (n == 1) 
        {
            return 1;
        }

        int minIndex = -1;
        int maxIndex = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) 
        {
            if (nums[i] < min) 
            {
                min = nums[i];
                minIndex = i;
            }
            if (nums[i] > max) 
            {
                max = nums[i];
                maxIndex = i;
            }
        }

        int leftIndex = Math.min(minIndex, maxIndex);
        int rightIndex = Math.max(minIndex, maxIndex);

        // Strategy 1: Delete from left
        int removeFromLeft = rightIndex + 1;

        // Strategy 2: Delete from right
        int removeFromRight = n - leftIndex;

        // Strategy 3: Delete from both sides
        int leftDeletions = leftIndex + 1;
        int rightDeletions = n - rightIndex;

        int removeFromBoth = leftDeletions + rightDeletions;

        // Find the smallest answer
        int answer;

        if (removeFromLeft <= removeFromRight && removeFromLeft <= removeFromBoth) 
        {
            answer = removeFromLeft;
        } 
        else if (removeFromRight <= removeFromBoth) 
        {
            answer = removeFromRight;
        } 
        else 
        {
            answer = removeFromBoth;
        }

        return answer;
    }
}