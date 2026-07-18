class Solution 
{
    public int findGCD(int[] nums) 
    {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) 
        {
            if (num < min)
                min = num;

            if (num > max)
                max = num;
        }

        return findgcd(min, max);
    }

    public int findgcd(int min, int max) 
    {
        int maxGcd = 1;
        for (int i = 1; i <= min; i++) 
        {
            if (min % i == 0 && max % i == 0) 
            {
                maxGcd = Math.max(i, maxGcd);
            }
        }
        return maxGcd;
    }
}