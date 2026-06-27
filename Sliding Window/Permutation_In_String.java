class Solution 
{ 
    public boolean checkInclusion(String s1, String s2) 
    {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 > n2)
            return false;

        int[] s1_freq = new int[26];
        int[] s2_freq = new int[26];

        for (int i = 0; i < n1; i++) 
        {
            s1_freq[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = 0;

        while (right < n2) 
        {
            s2_freq[s2.charAt(right) - 'a']++;

            if (right - left + 1 > n1) 
            {
                s2_freq[s2.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(s1_freq, s2_freq)) 
            {
                return true;
            }

            right++;
        }

        return false;
    }
}