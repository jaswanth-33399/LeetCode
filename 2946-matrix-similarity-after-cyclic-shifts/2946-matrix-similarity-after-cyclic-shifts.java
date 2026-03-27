class Solution 
{
    public boolean areSimilar(int[][] mat, int k) 
    {
        int[][] grid = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++) grid[i] = mat[i].clone();
        k = k%mat[0].length;
        for(int i=0;i<mat.length;i++)
        {
            if(i%2==0)
            {
                rotate(mat[i],0,k-1);
                rotate(mat[i],k,mat[0].length-1);
                rotate(mat[i],0,mat[0].length-1);
            }
            else
            {
                rotate(mat[i],0,mat[0].length-1);
                rotate(mat[i],0,k-1);
                rotate(mat[i],k,mat[0].length-1);
            }
        }
        return Arrays.deepEquals(mat,grid);
    }
    public static void rotate(int[] a,int s,int e)
    {
        while(s<e)
        {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
}