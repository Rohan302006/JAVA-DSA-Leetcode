class Solution 
{
    public int[] resultArray(int[] nums) 
    {
        int n = nums.length;

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(nums[0]);                 // it is given that atleast three elements will be there in the array
        list2.add(nums[1]);

        for (int i = 2; i < n; i++) {
            int lastElement_of_list1 = list1.get(list1.size() - 1);
            int lastElement_of_list2 = list2.get(list2.size() - 1);

            if (lastElement_of_list1 > lastElement_of_list2) 
            {
                list1.add(nums[i]);
            } 
            else 
            {
                list2.add(nums[i]);
            }
        }

        int[] result = new int[n];
        for (int i = 0; i < list1.size(); i++) 
        {
            result[i] = list1.get(i);
        }

        for (int i = 0; i < list2.size(); i++) 
        {
            result[list1.size() + i] = list2.get(i);            //  we will copy elements remaining after the first list1 is end
        }

        return result;

    }
}