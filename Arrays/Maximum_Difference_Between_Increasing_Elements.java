class Solution {
    public int maximumDifference(int[] nums) {
        int minimum = nums[0];
        int maxDifference = -1;

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] > minimum) 
            {
                int Difference = nums[i] - minimum;
                maxDifference = Math.max(maxDifference, Difference);
            } 
            else 
            {
                minimum = nums[i];
            }
        }

        return maxDifference;
    }
}