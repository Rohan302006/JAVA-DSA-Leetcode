class Solution {
    public int minOperations(String[] logs) {

        Stack<String> st = new Stack<>();

        for (int i = 0; i < logs.length; i++) 
        {
            if (logs[i].equals("../")) 
            {
                if (st.size() > 0) 
                {
                    st.pop();
                }
            } 
            else if (logs[i].equals("./")) 
            {
                continue;
            } 
            else 
            {
                st.push(logs[i]);
            }
        }
        return st.size();
    }
}


// Can be solved using this way also   SC = O(1)

// int count = 0;
// for(int i=0; i<logs.length; i++)
// {
//     if(logs[i].equals("../"))
//     {
//         if(count>0)
//         {
//             count--;
//         }
//     }
//     else if(logs[i].equals("./") )
//     {
//         continue;
//     }
//     else
//     {
//         count++;
//     }
// }
// return count;
