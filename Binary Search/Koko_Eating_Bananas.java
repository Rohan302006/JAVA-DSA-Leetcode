class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int n = piles.length;
        int maxElement = piles[0];

        for (int i : piles) 
        {
            if (i > maxElement) 
            {
                maxElement = i;
            }
        }

        int left = 1;
        int right = maxElement;

        while (left < right) 
        {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, mid, h)) 
            {
                right = mid;
            } 
            else 
            {
                left = mid + 1;
            }
        }
        
        return left;
    }

    public boolean canEatAll(int[] arr, int mid, int h) 
    {
        int actualHours = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            actualHours += arr[i] / mid;

            if (arr[i] % mid != 0) 
            {
                actualHours++;
            }

        }
        
        return actualHours <= h;
    }
}