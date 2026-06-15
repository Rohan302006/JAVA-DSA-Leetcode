class Solution 
{
    public int numPairsDivisibleBy60(int[] time) 
    {
        int count = 0;
        int[] remainders = new int[60];

        for (int t : time) 
        {
            int rem = t % 60;

            if (rem == 0) {
                count = count + remainders[0];
            } else {
                count = count + remainders[60 - rem];
            }
            remainders[rem]++;
        }
        
        return count;
    }
}