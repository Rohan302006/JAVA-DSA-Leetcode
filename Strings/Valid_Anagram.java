import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) 
    {
        int n1 = s.length();
        int n2 = t.length();

        if(n1!=n2)
        {
            return false;
        }

        else
        {
            char[] Array_of_string_s = s.toCharArray();
            char[] Array_of_string_t = t.toCharArray();

            Arrays.sort(Array_of_string_s);
            Arrays.sort(Array_of_string_t);

            String sortedString1 = new String(Array_of_string_s);
            String sortedString2 = new String(Array_of_string_t);

            if(sortedString1.equals(sortedString2))
            {
                return true;
            }
        }
        return false;
    }
}