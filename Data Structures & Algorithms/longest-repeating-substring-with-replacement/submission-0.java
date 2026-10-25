class Solution {
    public int characterReplacement(String s, int k) {
        int count[]=new int[26];
        int left=0;
        int n=s.length();
        int maxfreq=Integer.MIN_VALUE;
        int ans=Integer.MIN_VALUE;
        for(int right=0;right<n;right++)
        {
            count[s.charAt(right)-'A']+=1;
            maxfreq=Math.max(maxfreq,count[s.charAt(right)-'A']);
            if(right-left+1-maxfreq>k)
            {
                count[s.charAt(left)-'A']-=1;
                left++;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
