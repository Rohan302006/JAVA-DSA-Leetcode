class Solution 
{
    public int maxFrequencyElements(int[] nums) 
    {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) 
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int totalFreq = 0;
        int maxFrequency = 0;

        for (int freq : map.values()) 
        {
            if (freq > maxFrequency) 
            {
                maxFrequency = freq;
            }
        }

        for (int freq : map.values()) 
        {
            if (freq == maxFrequency) 
            {
                totalFreq += freq;
            }
        }

        return totalFreq;
    }
}