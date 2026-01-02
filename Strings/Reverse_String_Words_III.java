class Solution 
{
    private void reverse(char[] arr, int left, int right)   // Function to reverse string
    {
        while (left < right) 
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public String reverseWords(String s)                // Solution
    {
        char[] CharacterArray = s.toCharArray();
        int start = 0;
        for(int i=0; i<=CharacterArray.length; i++)
        {
            if (i == CharacterArray.length || CharacterArray[i] == ' ')
            {
                reverse(CharacterArray, start, i - 1);  
                start = i + 1;     
            }
        }
        return new String(CharacterArray);
    }
}