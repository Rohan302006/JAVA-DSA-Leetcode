class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int n = s.length();
        int count = 0;
        int[] arr = new int[3]; // since only a,b and c

        int left = 0;
        int right = 0;

        while (right < n) 
        {
            char ch = s.charAt(right);
            arr[ch - 'a']++;

            while (arr[0] > 0 && arr[1] > 0 && arr[2] > 0) 
            {
                count += (n - right);
                arr[s.charAt(left) - 'a']--;
                left++;
            }

            right++;
        }
        
        return count;
    }
}