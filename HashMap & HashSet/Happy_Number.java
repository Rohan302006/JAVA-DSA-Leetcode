class Solution 
{
    public boolean isHappy(int n) 
    {
        Set<Integer> set = new HashSet<>();

        while(n!=1)
        {
            if(set.contains(n))
            {
                return false;
            }
            set.add(n);
            n = takenext(n);
        }
        return true;
    }

    private int takenext(int n)
    {
        int sum = 0;
        while(n>0)
        {
            int rem = n % 10;
            sum = sum + (rem * rem);
            n = n/10;
        }
        return sum;
    }
}