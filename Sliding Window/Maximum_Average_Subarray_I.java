class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < k; i++) 
        {
            sum += nums[i];
        }

        double maxSum = sum;

        for (int i = k; i < n; i++) 
        {
            sum -= nums[i - k];
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }
}