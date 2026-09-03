class Solution {
    public String removeStars(String s) { 
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) 
        {
            if (ch == '*') 
            {
                if (!st.isEmpty()) 
                {
                    st.pop();
                }

            } 
            else 
            {
                st.push(ch);
            }

        }
        
        StringBuilder s1 = new StringBuilder("");
        
        for (char ch : st) 
        {
            s1.append(ch);
        }

        return s1.toString();
    }
}

/*  
    Without Stack Approach (EASY)

    StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) 
        {
            if (ch == '*') 
            {
                sb.deleteCharAt(sb.length() - 1);
            } 
            else 
            {
                sb.append(ch);
            }
        }

        return sb.toString();

 */