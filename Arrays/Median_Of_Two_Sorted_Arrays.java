class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int mergedLength = nums1.length + nums2.length;
        double[] arr = new double[mergedLength];
        int index = 0;

        for (int i : nums1) 
        {
            arr[index++] = i;
        }

        for (int j : nums2) 
        {
            arr[index++] = j;
        }

        Arrays.sort(arr);

        int n = arr.length;
        int med = 0;

        if (n % 2 == 0) 
        {
            double middle1 = arr[n / 2 - 1];
            double middle2 = arr[n / 2];
            return (middle1 + middle2) / 2.0;
        } 
        else 
        {
            return arr[n / 2];
        }
    }
}