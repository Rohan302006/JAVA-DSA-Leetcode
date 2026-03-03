class Solution 
{
    public int maxLengthBetweenEqualCharacters(String s) 
    {
        int n = s.length();
        int maxLength = -1;

        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (s.charAt(i) == s.charAt(j)) 
                {
                    int length = j - i - 1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }
}