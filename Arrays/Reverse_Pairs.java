class Solution 
{
    public void merge(int[] arr, int low, int mid, int high) 
    {
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) 
        {
            if (arr[left] <= arr[right]) 
            {
                temp[k++] = arr[left++];
            } 
            else 
            {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) 
        {
            temp[k++] = arr[left++];
        }

        while (right <= high) 
        {
            temp[k++] = arr[right++];
        }

        for (int i = low; i <= high; i++) 
        {
            arr[i] = temp[i - low];
        }
    }

    public int countPairs(int[] arr, int low, int mid, int high) 
    {
        int right = mid + 1;
        int count = 0;

        for (int i = low; i <= mid; i++) 
        {
            while (right <= high && (long) arr[i] > 2L * arr[right]) 
            {
                right++;
            }

            count += (right - (mid + 1));
        }

        return count;
    }

    public int mergeSort(int[] arr, int low, int high) 
    {
        int count = 0;

        if (low >= high) 
        {
            return count;
        }

        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);

        return count;
    }

    public int reversePairs(int[] nums) 
    {
        return mergeSort(nums, 0, nums.length - 1);
    }
}