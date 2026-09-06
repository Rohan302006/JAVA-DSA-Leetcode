class Solution 
{
    public int maxArea(int[] height) 
    {
        int left = 0;
        int right = height.length - 1;
        int MaxArea = 0;

        while (left < right) 
        {
            int Width = right - left;
            int Minimum_Height = Math.min(height[left], height[right]);
            int curr_area = Width * Minimum_Height;

            MaxArea = Math.max(MaxArea, curr_area);

            if (height[left] < height[right]) 
            {
                left++;
            } 
            else 
            {
                right--;
            }
        }
        return MaxArea;
    }
}