class Solution 
{
    public int minimumCost(int[] cost) 
    {
        int n = cost.length;
        Arrays.sort(cost);
        int buyPrice = 0;

        for (int i = n - 1; i >= 0; i -= 3) 
        {
            buyPrice += cost[i];

            if (i - 1 >= 0) 
            {
                buyPrice += cost[i - 1];
            }
        }
        return buyPrice;
    }
}