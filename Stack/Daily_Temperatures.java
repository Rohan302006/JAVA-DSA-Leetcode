class Solution 
{
    public int[] dailyTemperatures(int[] t) 
    {
        int[] result = new int[t.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < t.length; i++) 
        {
            while (!st.empty() && t[st.peek()] < t[i]) 
            {
                int remove = st.pop();
                result[remove] = i - remove;
            }
            st.push(i);
        }
        return result;
    }
}