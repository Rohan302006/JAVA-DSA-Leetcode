import java.util.Arrays;
class Solution 
{
    public int minimumDifference(int[] nums, int k) 
    {
        if (k == 1)
            return 0;

        int n = nums.length;
        Arrays.sort(nums);
        int MinDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) 
        {
            int Diff = nums[i + k - 1] - nums[i];
            MinDiff = Math.min(MinDiff, Diff);
        }
        return MinDiff;
    }
}