class Solution 
{
    public String convertToBase7(int num) 
    {
        if (num == 0) 
        {
            return "0";
        }

        boolean negative = num < 0;
        int n = Math.abs(num);

        StringBuilder sb = new StringBuilder();

        while (n > 0) 
        {
            int remainder = n % 7;
            sb.append(remainder);
            // sb.append(n%7);           (instead of above two lines)
            n /= 7;
        }

        if (negative) 
        {
            sb.append("-");
        }

        return sb.reverse().toString();
    }
}


// One line Solution
// return Integer.toString(num,7);