class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp=new HashMap<>();
        for(String s: strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String r = new String(ch);
            if(mp.containsKey(r))
            {
                mp.get(r).add(s);
            }
            else
            {
                mp.put(r, new ArrayList<>());
                mp.get(r).add(s);
            }
                
        }
        return new ArrayList<>(mp.values());
    }
}
