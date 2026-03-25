class Solution 
{
    public boolean areAlmostEqual(String s1, String s2) 
    {
        int n = s1.length();
        int a[] = new int[2];
        int ind=0;
        int count=0;
        for(int i=0;i<n;i++) if(s1.charAt(i)!=s2.charAt(i)) count++;
        if(count>2) return false;
        else
        {
            for(int i=0;i<n;i++) if(s1.charAt(i)!=s2.charAt(i)) a[ind++] = i;
            if((s1==s2) || (s1.charAt(a[0])==s2.charAt(a[1]) && s1.charAt(a[1])==s2.charAt(a[0]))) return true;
            else return false;
        }
    }
}