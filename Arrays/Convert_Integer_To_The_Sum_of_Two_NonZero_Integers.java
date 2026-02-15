class Solution 
{
    public int[] getNoZeroIntegers(int n) 
    {
        for (int i = 1; i < n; i++) 
        {
            int j = n - i;
            if (NonZero(i) && NonZero(j)) 
            {
                return new int[] { i, j };
            }
        }
        return new int[] {};
    }

    public boolean NonZero(int num) 
    {
        while (num > 0) 
        {
            if (num % 10 == 0) 
            {
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}