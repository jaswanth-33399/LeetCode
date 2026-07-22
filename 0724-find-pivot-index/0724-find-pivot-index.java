class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int total_sum = 0;
        for(int i:nums) total_sum += i;
        System.out.println(total_sum+"jd");
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(sum==total_sum-sum-nums[i]) return i;
            sum += nums[i];
        }
        return -1;
    }
}