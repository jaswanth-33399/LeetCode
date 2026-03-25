class Solution 
{
    public boolean canPartitionGrid(int[][] grid) 
    {
        long row_sum = 0;
        List<Long> row = new ArrayList<>();
        long col_sum = 0;
        List<Long> col = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            long sum = 0;
            for(int j=0;j<grid[0].length;j++) sum += grid[i][j];
            row_sum += sum;
            row.add(sum);
        }
        for(int i=0;i<grid[0].length;i++)
        {
            long sum = 0;
            for(int j=0;j<grid.length;j++) sum += grid[j][i];
            col_sum += sum;
            col.add(sum);
        }
        long sum_row = 0;
        long sum_col = 0;
        for(int i=0;i<row.size();i++)
        {
            sum_row += row.get(i);
            if(sum_row==(row_sum-sum_row)) return true;
        }
        for(int i=0;i<col.size();i++)
        {
            sum_col += col.get(i);
            if(sum_col==(col_sum-sum_col)) return true;
        }
        return false;
    }
}