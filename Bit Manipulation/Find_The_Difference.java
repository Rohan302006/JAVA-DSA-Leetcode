class Solution 
{
    public char findTheDifference(String s, String t) 
    {

        int XOR_Result = 0;

        for (int i = 0; i < s.length(); i++) 
        {
            XOR_Result ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) 
        {
            XOR_Result ^= t.charAt(i);
        }

        return (char) XOR_Result;
    }
}