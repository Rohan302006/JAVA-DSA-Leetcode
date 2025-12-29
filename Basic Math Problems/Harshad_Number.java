class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) 
    {
        int sum = 0;
        int temp = x;
        while(x!=0)
        {
            int LastDigit = x%10;
            sum+=LastDigit;
            x/=10;
        }
        int result=(temp%sum==0)? sum : -1;
        return result;
    }
}