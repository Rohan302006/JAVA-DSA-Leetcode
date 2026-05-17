class Solution 
{
    public int mostFrequentEven(int[] nums) 
    {
        int MaxFreq = 0, ans = -1;
        int n = nums.length;
        Map<Integer, Integer> EvenMap = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            if (nums[i] % 2 == 0) 
            {
                EvenMap.put(nums[i], EvenMap.getOrDefault(nums[i], 0) + 1);
            }
        }

        for (int i : EvenMap.keySet()) 
        {
            int freq = EvenMap.get(i);
            if (freq > MaxFreq) 
            {
                MaxFreq = freq;
                ans = i;
            } 
            else if (freq == MaxFreq && i < ans) 
            {
                ans = i;
            }
        }
        return ans;
    }
}