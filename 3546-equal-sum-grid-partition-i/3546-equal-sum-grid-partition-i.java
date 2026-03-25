class Solution 
{
    public boolean canPartitionGrid(int[][] grid) 
    {
        long sum = 0;
        for(int i=0;i<grid.length;i++) for(int j=0;j<grid[0].length;j++) sum += grid[i][j];
        long row_sum = 0;
        long col_sum = 0;
        for(int i=0;i<grid.length-1;i++)
        {
            for(int j=0;j<grid[0].length;j++) row_sum += grid[i][j];
            if(row_sum==(sum-row_sum)) return true;
        }
        for(int i=0;i<grid[0].length-1;i++)
        {
            for(int j=0;j<grid.length;j++) col_sum += grid[j][i];
            if(col_sum==(sum-col_sum)) return true;
        }
        return false;
    }
}