class Solution 
{
    public double minimumAverage(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        double min = Double.MAX_VALUE;

        int i = 0, j = nums.length - 1;

        while (i < j) 
        {
            double avg = (nums[i] + nums[j]) / 2.0;
            min = Math.min(avg, min);
            i++;
            j--;
        }

        return min;
    }
}