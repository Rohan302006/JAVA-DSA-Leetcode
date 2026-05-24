class Solution 
{
    public int averageValue(int[] nums) 
    {
        int count = 0;
        int avg = 0;
        int sum = 0;
        for (int n : nums) 
        {
            if (n % 6 == 0)  
            {
                sum += n;
                count++;
            }
        }
        if (count > 1) 
        {
            avg = sum / count;
        } 
        else 
        {
            avg = sum;
        }
        return avg;
    }
}