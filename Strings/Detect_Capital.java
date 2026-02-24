class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        int n = word.length();
        int capitals = 0;

        for (char c : word.toCharArray()) 
        {
            if (Character.isUpperCase(c))
                capitals++;
        }

        return capitals == 0 || capitals == n || (capitals == 1 && Character.isUpperCase(word.charAt(0)));
    }
}