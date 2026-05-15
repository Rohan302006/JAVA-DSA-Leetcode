class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        char[] charArray = s.toCharArray();
        char[] result = new char[s.length()];

        for (int i = 0; i < indices.length; i++) 
        {
            result[indices[i]] = charArray[i];
        }

        return new String(result);
    }
}