class Solution 
{
    public int smallestNumber(int n, int t) 
    {
        while (true) 
        {
            int product = 1;
            int temp = n;

            while (temp > 0) 
            {
                int lastDigit = temp % 10;
                product *= lastDigit;
                temp /= 10;
            }

            if (product % t == 0) 
            {
                return n;
            }
            n++;
        }
    }
}

/*
    class Solution
    {
        int product = 1;
        int temp = n;

        while(temp > 0)
        {
            int lastDigit = temp % 10;
            product*=lastDigit;
            temp /= 10;
        }
        
        if(product % t == 0)
        {
            return n;
        }
        else
        {
            return smallestNumber(n+1, t);
        }
    }

*/