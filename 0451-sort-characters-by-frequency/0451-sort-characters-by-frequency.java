class Solution 
{
    public String frequencySort(String s) 
    {
        StringBuilder str = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
		List<Map.Entry<Character,Integer>> ls = new ArrayList<>(map.entrySet());
		ls.sort((a,b)-> b.getValue()-a.getValue());
		for(var v:ls) 
        {
            int c = v.getValue();
            while(c-->0) str.append(v.getKey());
        }
        return str.toString();
    }
}