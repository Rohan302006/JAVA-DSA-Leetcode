class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) 
        {
            minHeap.offer(nums[i]);
        }

        for (int i = k; i < nums.length; i++) 
        {
            if (nums[i] > minHeap.peek()) 
            {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();
    }
}

/*
We can use this too but it is mentioned in questioned to do not use it 

    Arrays.sort(nums);
    return nums[nums.length-k];

*/