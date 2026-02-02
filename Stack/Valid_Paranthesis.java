class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack();
        for (char i : s.toCharArray()) 
            {
            if (isOpenBracket(i)) 
            {
                stack.push(i);
            } else 
                {
                if (stack.size() == 0) 
                {
                    return false;
                } 
                else 
                {
                    if (isMatchingBracket(stack.peek(), i)) 
                    {
                        stack.pop();
                    } 
                    else 
                    {
                        return false;
                    }

                }
            }
        }
        return stack.size() == 0;
    }


    private boolean isOpenBracket(char c) 
    {
        switch (c) 
        {
            case '{':
            case '[':
            case '(':
                return true;
            default:
                return false;
        }
    }

    
    private boolean isMatchingBracket(char c, char d) 
    {
        if (c == '(' && d == ')') 
        {
            return true;
        } else if (c == '{' && d == '}') 
        {
            return true;
        } else if (c == '[' && d == ']') 
        {
            return true;
        } else 
        {
            return false;
        }
    }
}