class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        int AsciiSum = 0;
        for (int i = 0; i < t.length(); i++) 
        {
            AsciiSum += t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) 
        {
            AsciiSum -= s.charAt(i);
        }

        return (char) AsciiSum;
    }
}