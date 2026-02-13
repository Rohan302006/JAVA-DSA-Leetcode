class Solution 
{
    public boolean equalFrequency(String word) 
    {
        int[] count = new int[26];
        for (char c : word.toCharArray()) 
        {
            count[c - 'a']++;
        }
        for (int i = 0; i < 26; i++) 
        {
            count[i]--;
            if (EqualFreq(count)) 
            {
                return true;
            }
            count[i]++;
        }
        return false;
    }

    public boolean EqualFreq(int[] arr) 
    {
        int cnt = 0;
        for (int c : arr) 
        {
            if (c == 0 || cnt == c) 
            {
                continue;
            } 
            else if (cnt == 0) 
            {
                cnt = c;
            } 
            else 
            {
                return false;
            }
        }
        return true;
    }
}