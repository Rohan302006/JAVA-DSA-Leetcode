class Solution
{
    public boolean checkAlmostEquivalent(String word1, String word2) 
    {
        int[] count = new int[26];
        for (char ch : word1.toCharArray()) 
        {
            count[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) 
        {
            count[ch - 'a']--;
        }

        for (int d : count) 
        {
            if (d > 3 || d < -3) 
            {
                return false;
            }
        }
        return true;
    }
}