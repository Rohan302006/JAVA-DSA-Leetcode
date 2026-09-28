class Solution 
{
    public int maxDepth(String s) 
    {
        Stack<Character> st = new Stack<>();           // O(n) extra space due to stack
        int count = 0;
        int maxCount = 0;
        for (char ch : s.toCharArray()) 
        {
            if (ch == '(') 
            {
                st.push('(');
                count++;
            }
            else if (ch == ')') 
            {
                st.pop();
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}

/*      We can use this as well 
        Optimal Solution using No extra Space ( TC=O(n), SC=O(1) )

    class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (ch == ')') {
                count--;
            }
        }

        return maxCount;
    }
}

 */