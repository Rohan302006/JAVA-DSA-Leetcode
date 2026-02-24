class Solution 
{
    public String largestEven(String s) 
    {
        int n = s.length() - 1;
        for (int i = n; i >= 0; i--) 
            {
            if (s.charAt(i) % 2 == 0) 
                {
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}