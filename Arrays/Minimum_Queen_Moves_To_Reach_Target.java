class Solution 
{
    public int minQueenMoves(int[] source, int[] target) 
    {
        if (Arrays.equals(source, target)) 
        {
            return 0;
        }

        int source_row = source[0];
        int source_col = source[1];
        int target_row = target[0];
        int target_col = target[1];

        if (source_row == target_row) 
        {
            return 1;
        }

        if (source_col == target_col) 
        {
            return 1;
        }

        if (Math.abs(source_row - target_row) == Math.abs(source_col - target_col)) 
        {
            return 1;
        }

        return 2;
    }
}