class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int product = 1;
        int sum = 0;
        int temp = n;

        while (n > 0) 
        {
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        
        int total_num = sum + product;

        return temp % total_num == 0;
    }
}