class Solution 
{
    public int findLucky(int[] arr) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) 
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int result = -1;
        for (int number : map.keySet()) 
        {
            if (number == map.get(number)) 
            {
                result = Math.max(result, number);
            }
        }
        return result;
    }
}