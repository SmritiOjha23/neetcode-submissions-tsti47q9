class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        int n=s2.length();

        int need[]=new int[26];
        int window[]=new int[26];

        int left=0;

        for(int i=0;i<k;i++)
        {
            char ch=s1.charAt(i);
            need[ch-'a']+=1;
        }

        for(int right=0;right<n;right++)
        {
            char ch=s2.charAt(right);
            window[ch-'a']++;
            if(right-left+1==k)
            {
                if(Arrays.equals(need,window))
                    return true;
                char ph=s2.charAt(left);
                window[ph-'a']--;
                left++;
            }
        }
        return false;
    }
}
