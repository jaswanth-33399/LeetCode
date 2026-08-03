class Solution 
{
    public int countValidPrefixes(String s) 
    {
        int count_1 = 0;
        int count_0 = 0;
        int count = 0;
        for(char c:s.toCharArray())
        {
            if(c=='0') count_0++;
            else count_1++;
            if(Math.abs(count_0-count_1)<2) count++;
        }
        return count;
    }
}