class Solution 
{
    public boolean isPalindrome(String str) 
    {
        str = str.toLowerCase();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<str.length();i++) if(Character.isLetterOrDigit(str.charAt(i))) s.append(str.charAt(i));
        if(s.toString().equals(s.reverse().toString())) return true;
        return false;
    }
}