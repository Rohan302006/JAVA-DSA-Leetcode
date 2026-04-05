class Solution 
{
    public List<Integer> grayCode(int n) 
    {

        List<Integer> arr = new ArrayList<>();
        int size = 1 << n;

        for (int i = 0; i < size; i++) 
        {
            arr.add(i ^ (i >> 1));
        }
        return arr;
    }
}