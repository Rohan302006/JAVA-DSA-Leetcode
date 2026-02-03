class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) 
        {
            map.put(n, 1);
        }

        List<Integer> answer = new ArrayList<>();

        for (int i : nums2) 
        {
            if (map.containsKey(i) && map.get(i) == 1) 
            {
                map.put(i, 0);
                answer.add(i);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) 
        {
            result[i] = answer.get(i);
        }

        return result;
    }
}