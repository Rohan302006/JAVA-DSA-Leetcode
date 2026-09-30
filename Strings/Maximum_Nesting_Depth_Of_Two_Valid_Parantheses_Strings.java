class Solution 
{
    public int[] maxDepthAfterSplit(String seq) 
    {
        char[] chars = seq.toCharArray();
        int[] res = new int[chars.length];

        for (int i = 0; i < chars.length; i++) 
        {
            boolean isOpen = (chars[i] == '(');
            boolean isEven = (i % 2 == 0);

            if (isOpen == isEven) 
            {
                res[i] = 0;
            } 
            else 
            {
                res[i] = 1;
            }
        }
        return res;
    }
}