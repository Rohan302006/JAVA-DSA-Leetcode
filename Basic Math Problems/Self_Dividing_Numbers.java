class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> arr = new ArrayList<>();

        for (int i = left; i <= right; i++) 
        {
            if (isSelfDividing(i)) 
            {
                arr.add(i);
            }
        }
        return arr;
    }

    public boolean isSelfDividing(int num) 
    {
        int temp = num;
        while (temp > 0) 
        {
            int lastDigit = temp % 10;
            if (lastDigit == 0 || (num % lastDigit) > 0) 
            {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}