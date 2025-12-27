import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashSet<Integer> seen = new HashSet<>();   // creating hashset named seen in which we storing all elements of nums

        for (int num : nums)     // it means for every element in "nums" store it in  variable "num"
        {
            if (seen.contains(num)) 
            {
                return num;  // duplicate found
            }
            seen.add(num);
        }

        return -1; 
    }
}
