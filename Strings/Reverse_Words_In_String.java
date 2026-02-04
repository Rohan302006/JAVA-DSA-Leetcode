class Solution 
{
    public String reverseWords(String s) 
    {
        String[] WordsArray = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = WordsArray.length - 1; i >= 0; i--) 
        {
            sb.append(WordsArray[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}