class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> mp=new HashMap<>();
        for(String str: strs)
        {
            char ch[]=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(mp.containsKey(s))
                mp.get(s).add(str);
            else
            {
                ArrayList<String> arr=new ArrayList<>();
                arr.add(str);
                mp.put(s,arr);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
