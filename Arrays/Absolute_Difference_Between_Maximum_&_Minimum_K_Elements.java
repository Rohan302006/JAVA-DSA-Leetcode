import java.util.Arrays;
class Solution 
{
    public int absDifference(int[] nums, int k) 
    {
        int n = nums.length;
        Arrays.sort(nums);

        if (n == 1 || k > n)
            return 0;

        int LargeSum = 0;
        for (int i = n - k; i < n; i++) 
        {
            LargeSum += nums[i];
        }

        int SmallSum = 0;
        for (int i = 0; i < k; i++) 
        {
            SmallSum += nums[i];
        }

        int absoluteDiff = Math.abs(LargeSum - SmallSum);

        return absoluteDiff;
    }
}