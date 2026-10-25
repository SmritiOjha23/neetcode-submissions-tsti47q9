class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int l=t.length();
        if(n!=l)
            return false;
        char ch[]=new char[26];
        for(int i=0;i<l;i++)
        {
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;

        }
        for(int i=0;i<26;i++)
        {
            if(ch[i]!=0)
                return false;
        }
        return true;
    }
}
