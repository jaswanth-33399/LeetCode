class Solution 
{
    public int maxProduct(int n) 
    {
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        while(n>0) 
        {
            int rem = n%10;
            if(rem>=f)
            {
                s = f;
                f = rem;
            }
            else if(rem>s) s = rem;
            n /= 10;
        }
        return f*s;
    }
}