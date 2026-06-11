class Solution 
{
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int n = nums.length;
        
        int maxPositiveProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int maxNegativeProduct = nums[0] * nums[1] * nums[n - 1];

        int maxProduct = Math.max(maxPositiveProduct, maxNegativeProduct);

        return maxProduct;
    }
}