class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int a[] = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int pos = nums.length-1;
        while(i<=j)
        {
            int i_2 = nums[i]*nums[i];
            int j_2 = nums[j]*nums[j];
            if(i_2>j_2) 
            {
                a[pos--] = i_2;
                i++;
            }
            else
            {
                a[pos--] = j_2;
                j--;
            }
        }
        return a;
    }
}