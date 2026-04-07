import java.util.*;

class Solution 
{
    public int[] findErrorNums(int[] nums) 
    {

        Map<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;

        for (int i : nums) 
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) 
        {
            if (map.get(key) == 2) 
            {
                duplicate = key;
            }
        }

        for (int i = 1; i <= nums.length; i++)
        {
            if (!map.containsKey(i)) 
            {
                missing = i;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }
}