class Solution 
{
    public int minDays(int[] bloomDay, int m, int k) 
    {

        int minDay = Arrays.stream(bloomDay).min().getAsInt();
        int maxDay = Arrays.stream(bloomDay).max().getAsInt();

        if ((long) m * k > bloomDay.length) 
        { 
            return -1;
        }

        int ans = -1;

        while (minDay <= maxDay) 
        {
            int mid = minDay + (maxDay - minDay) / 2;

            if (isPossible(bloomDay, mid, m, k)) 
            {
                ans = mid; // mid is answer
                maxDay = mid - 1; // Try to find a smaller day
            } 
            else 
            {
                minDay = mid + 1; // Need more days
            }
        }

        return ans;
    }

    public boolean isPossible(int[] arr, int day, int m, int k) 
    {
        int count = 0;
        int no_of_B = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] <= day) {
                count++;
            } else {
                no_of_B += (count / k);
                count = 0;
            }
        }
        
        no_of_B += (count / k);

        return no_of_B >= m;
    }
}