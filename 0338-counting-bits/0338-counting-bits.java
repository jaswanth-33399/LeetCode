class Solution 
{
    public int[] countBits(int n) 
    {
        int a[] = new int[n+1];
        a[0] = 0;
        for(int i=0;i<=n;i++) a[i] = a[i>>1]+(i&1);
        return a;
    }
}