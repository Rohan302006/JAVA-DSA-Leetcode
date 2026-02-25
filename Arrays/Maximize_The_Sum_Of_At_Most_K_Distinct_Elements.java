class Solution 
{
    public int[] maxKDistinct(int[] nums, int k) 
    {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) 
        {
            set.add(i);
        }

        List<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());

        int size = Math.min(list.size(), k);
        int[] result = new int[size];

        for (int i = 0; i < size; i++) 
        {
            result[i] = list.get(i);
        }

        return result;
    }
}
