class Solution 
{
    public int equalPairs(int[][] grid) 
    {
        int n = grid.length;
        int count = 0;
        Map<List<Integer>, Integer> map = new HashMap<>();

        for (int r = 0; r < n; r++) 
        {
            List<Integer> key = new ArrayList<>();
            
            for (int c = 0; c < n; c++) 
            {
                key.add(grid[r][c]);
            }

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int c = 0; c < n; c++) 
        {
            List<Integer> temp = new ArrayList<>();

            for (int r = 0; r < n; r++) 
            {
                temp.add(grid[r][c]);
            }

            count += map.getOrDefault(temp, 0);
        }

        return count;
    }
}

/* 
Brute Force O(n^3)

class Solution{
    public int equalPairs(int[][] grid){
        int count = 0;
        int n = grid.length;

        for(int r=0; r<n; r++)
        {
            for(int c=0; c<n; c++)
            {
                boolean isEqual = true;

                for(int i=0; i<n; i++)
                {
                    if(grid[r][i]!=grid[i][c])
                    {
                        isEqual = false;
                        break;
                    }
                }
                if(isEqual)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}

*/