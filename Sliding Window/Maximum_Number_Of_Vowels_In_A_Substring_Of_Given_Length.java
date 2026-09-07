class Solution 
{
    public int maxVowels(String s, int k) 
    {
        int n = s.length();
        int count = 0;
        int i = 0;
        int max = 0;

        for (int j = 0; j < n; j++) 
        {

            if (isVowel(s.charAt(j))) 
            {
                count++;
            }

            if (j - i + 1 > k) 
            {
                if (isVowel(s.charAt(i))) 
                {
                    count--;
                }
                i++;
            }
            
            if (j - i + 1 == k) 
            {
                max = Math.max(max, count);
            }
        }
        return max;

    }

    private boolean isVowel(char ch) 
    {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}
