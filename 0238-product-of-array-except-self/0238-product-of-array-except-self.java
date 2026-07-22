class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int ans[] = new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++) ans[i] = ans[i-1]*nums[i-1];
        int suff=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i] = ans[i]*suff;
            suff = suff * nums[i];
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna