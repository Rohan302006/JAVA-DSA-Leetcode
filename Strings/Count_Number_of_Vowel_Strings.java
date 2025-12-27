class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        
        int count =0;
        for(int i=left; i<=right; i++)
        {
            int string_length = words[i].length();
            char left_char = words[i].charAt(0);
            char right_char = words[i].charAt(string_length - 1);

            if((left_char =='a'|| left_char =='e'|| left_char =='i'|| left_char =='o'|| left_char   =='u') && (right_char =='a'|| right_char =='e'|| right_char== 'i'|| right_char=='o'|| right_char=='u'))
            {
                count++;
            }
        }
        return count;
    }
}