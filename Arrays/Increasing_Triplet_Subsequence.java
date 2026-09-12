class Solution 
{                                  
    public boolean increasingTriplet(int[] nums) 
    {
        int n = nums.length;
        int first_smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) 
        {

            if (nums[i] <= first_smallest) 
            {
                first_smallest = nums[i];
            }
            else if (nums[i] <= second_smallest) 
            {
                second_smallest = nums[i];
            }
            else 
            {
                return true;
            }
        }
        return false;
    }
}

/*  

    Brute Force TLE :-  TC O(n^3)

    class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(nums[i] < nums[j] && nums[j] < nums[k]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}



 */