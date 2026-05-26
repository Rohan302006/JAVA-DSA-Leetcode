class Solution 
{
    public int similarPairs(String[] words) 
    {
        int count = 0;
        for (int i = 0; i < words.length; i++) 
        {
            for (int j = i + 1; j < words.length; j++) 
            {
                if (Similar(words[i], words[j])) 
                {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean Similar(String s1, String s2) 
    {
        Set<Character> s1_Set = new HashSet<>();

        for (char ch : s1.toCharArray()) 
        {
            s1_Set.add(ch);
        }

        Set<Character> s2_Set = new HashSet<>();

        for (char ch : s2.toCharArray()) 
        {
            s2_Set.add(ch);
        }

        if (s1_Set.equals(s2_Set)) 
        {
            return true;
        }

        return false;
    }
}