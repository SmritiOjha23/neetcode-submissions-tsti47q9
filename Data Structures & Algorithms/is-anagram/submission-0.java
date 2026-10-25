class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int chars[]=new int[26];
        for(int i=0;i<t.length();i++)
        {
            char ch=s.charAt(i);
            char ph=t.charAt(i);
            chars[ch-'a']+=1;
            chars[ph-'a']-=1;
        }
        for(int i=0;i<26;i++)
            if(chars[i]!=0)
                return false;
        return true;
        
    }
}
