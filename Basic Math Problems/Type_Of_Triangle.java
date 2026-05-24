class Solution 
{
    public String triangleType(int[] nums) 
    {
        String res = "";
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if ((a + b > c) && (b + c > a) && (a + c > b)) 
        {
            if ((a == b) && (b == c)) 
            {
                res = "equilateral";
            } 
            else if ((a == b) || (b == c) || (a == c)) 
            {
                res = "isosceles";
            } 
            else 
            {
                res = "scalene";
            }
        } 
        else 
        {
            res = "none";
        }
        return res;
    }
}