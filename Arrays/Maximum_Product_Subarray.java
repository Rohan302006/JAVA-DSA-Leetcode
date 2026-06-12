class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int n = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++) 
        {
            prefixProduct *= nums[i];
            suffixProduct *= nums[n - i - 1];

            int maximumProduct = Math.max(prefixProduct, suffixProduct);

            ans = Math.max(ans, maximumProduct);

            if (prefixProduct == 0)
                prefixProduct = 1;
            if (suffixProduct == 0)
                suffixProduct = 1;
        }
        return ans;
    }
}