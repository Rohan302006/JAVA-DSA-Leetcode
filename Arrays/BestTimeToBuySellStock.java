class Solution {
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int BuyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<n; i++)
        {
            if(BuyPrice<prices[i])
            {
                int profit = prices[i] - BuyPrice;
                if(maxprofit<profit)
                    maxprofit = profit;
                
            }
            else
            {
                BuyPrice = prices[i];
            }
        }
        return maxprofit;
    }
}