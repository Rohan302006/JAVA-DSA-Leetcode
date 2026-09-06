class Solution 
{                                                                  // Still O(n^2)
    public int triangleNumber(int[] nums) 
    {                                                            // Easy Two Pointer Approach
        int count = 0;
        int n = nums.length;
        Arrays.sort(nums);

        for (int k = n - 1; k >= 2; k--) 
        {
            int i = 0;
            int j = k - 1;

            while (i < j) 
            {
                if (nums[i] + nums[j] > nums[k])             // Triangle Property:-    a + b > c
                {
                    int temp = j - i;
                    count += temp;
                    j--;
                } 
                else 
                {
                    i++;
                }
            }
        }
        return count;
    }
}

/*  Brute Force O(n^3)

    Arrays.sort(nums);
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++)
                {
                    if(nums[i] + nums[j] > nums[k]){
                        count++;
                    }
                }
            }
        }
        return count;

 */