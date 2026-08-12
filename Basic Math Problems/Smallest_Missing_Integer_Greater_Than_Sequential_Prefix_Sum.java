class Solution 
{
    public int missingInteger(int[] nums) 
    {
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++)    
        {
            if (nums[i] == nums[i - 1] + 1)     // Scanning the array and finding the sequential sum
            {
                sum += nums[i];
            } 
            else 
            {
                break;
            }
        }

        // After getting the sum put everything in set 
        Set<Integer> set = new HashSet<>();

        for (int i : nums) 
        {
            set.add(i);
        }

        // while the elements in set are less than or equal to the current sum we increament the sum (refer e.g. 2 from LC)

        while (set.contains(sum)) 
        {
            sum++;
        }

        return sum;

    }
}