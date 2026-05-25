class Solution 
{
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> answer = new ArrayList<>();

        for (int num : nums2) 
        {
            if (map.containsKey(num) && map.get(num) > 0) 
            {
                answer.add(num);
                map.put(num, map.get(num) - 1);
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