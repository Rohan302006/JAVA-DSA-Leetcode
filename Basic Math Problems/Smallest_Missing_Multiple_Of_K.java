class Solution 
{
    public int missingMultiple(int[] nums, int k) 
    {
        int original_k = k;
        while (true) 
        {
            boolean is_K_present = false;

            for (int i = 0; i < nums.length; i++) 
            {
                if (nums[i] == original_k) 
                {
                    is_K_present = true;
                    break;
                }
            }

            if (!is_K_present) 
            {
                return original_k;
            }

            original_k = original_k + k;
        }
    }
}