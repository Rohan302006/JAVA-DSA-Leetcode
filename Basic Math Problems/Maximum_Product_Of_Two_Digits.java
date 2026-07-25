class Solution 
{
    public int maxProduct(int n) 
    {
        int largestNum = 0;
        int secondLargestNum = 0;

        while (n > 0) 
        {
            int rem = n % 10;
            
            if (rem > largestNum) 
            {
                secondLargestNum = largestNum;
                largestNum = rem;
            } 
            else if (rem > secondLargestNum) 
            {
                secondLargestNum = rem;
            }

            n /= 10;
        }
        return secondLargestNum * largestNum;
    }
}