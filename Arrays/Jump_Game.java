class Solution {
    public boolean canJump(int[] nums) 
    {
        int n = nums.length;
        int jump_step = nums[0];
        for(int i=0; i<n; i++)
        {
            if(i>jump_step)
            {
                return false;
            }
            
            jump_step = (int)Math.max(jump_step, i + nums[i]);

            if(jump_step>=n-1)
            {
                return true;
            }
        }
        return true;
    }
}