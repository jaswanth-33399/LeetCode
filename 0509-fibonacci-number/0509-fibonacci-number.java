class Solution 
{
    int  dp[] = new int[31];
    public int fib(int n) 
    {
        if(dp[n]==0)
        {
            if(n==1) return 1;
            if(n==0) return 0;
            dp[n] = fib(n-1)+fib(n-2);
        }
        return dp[n];
    }
}