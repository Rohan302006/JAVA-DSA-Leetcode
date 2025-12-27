import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) 
    {
        int n = nums.length;
        int actual_sum = 0;
        int expected_sum = (n*(n+1))/2;
        for(int i=0; i<n; i++)
        {
            actual_sum+=nums[i];
        }
        int missing_num = expected_sum - actual_sum;

        return missing_num;
    }
}