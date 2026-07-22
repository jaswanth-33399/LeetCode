class Solution 
{
    public int thirdMax(int[] nums) 
    {
        Set<Integer> set = new TreeSet<>();
        for(int i:nums) set.add(i);
        int element = -1;
        int p = set.size()-2;
        if(set.size()<3) for(int i:set) element = i;
        else
        {
            for(int i:set)
            {
                element = i;
                if(--p<=0) break;
            }
        } 
        return element;
    }
}