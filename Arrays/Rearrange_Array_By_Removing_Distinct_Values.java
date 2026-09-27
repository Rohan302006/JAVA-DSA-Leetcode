class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int[] freq = new int[101];

        for (int n : nums) 
        {
            freq[n]++;
        }

        int[] ans = new int[nums.length];
        int index = 0;

        while (index < nums.length) 
        {
            for (int i = 1; i <= 100; i++) 
            {
                if (freq[i] > 0) 
                {
                    ans[index++] = i;
                    freq[i]--;
                }
            }
        }
        return ans;
    }
}