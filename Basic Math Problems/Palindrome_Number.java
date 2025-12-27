class Solution {
    public boolean isPalindrome(int x) 
    {
      int temp = x;
      int reversed = 0;
      while(temp!=0)
      {
        int remainder = temp%10; 
        reversed= (reversed*10) + remainder;
        temp/=10;
      }   
      if(reversed == x && x>=0)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}