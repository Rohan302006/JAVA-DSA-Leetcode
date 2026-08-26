class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2,
            int bx1, int by1, int bx2, int by2) {

        // Area of both rectangles
        int area1 = (ax2 - ax1) * (ay2 - ay1);
        int area2 = (bx2 - bx1) * (by2 - by1);

        // Finding the left boundary of overlap
        int left;
        if (ax1 > bx1) 
        {
            left = ax1;
        } 
        else 
        {
            left = bx1;
        }

        // Finding the right boundary of overlap
        int right;
        if (ax2 < bx2) 
        {
            right = ax2;
        } 
        else 
        {
            right = bx2;
        }

        // Finding the bottom boundary of overlap
        int bottom;
        if (ay1 > by1) 
        {
            bottom = ay1;
        } 
        else 
        {
            bottom = by1;
        }

        // Finding the top boundary of overlap
        int top;
        if (ay2 < by2) 
        {
            top = ay2;
        } 
        else 
        {
            top = by2;
        }

        // Calculating the overlap width and height
        int overlapWidth = right - left;
        int overlapHeight = top - bottom;

        int overlapArea;

        // If rectangles don't overlap we do:
        if (overlapWidth <= 0 || overlapHeight <= 0) 
        {
            overlapArea = 0;
        } 
        else 
        {
            overlapArea = overlapWidth * overlapHeight;         
        }

        return area1 + area2 - overlapArea;        // Subtracting the common area
    }
}
