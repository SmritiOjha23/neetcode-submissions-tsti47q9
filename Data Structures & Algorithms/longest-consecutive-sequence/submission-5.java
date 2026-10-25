class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)
            hs.add(num);
        int ans=0;
        for(int num:hs)
        {
            if(!hs.contains(num-1))
            {
                int streak=1;
                int curr=num+1;
                while(hs.contains(curr))
                {
                    streak++;
                    curr+=1;
                }
                ans=Math.max(ans,streak);
            }
        }
        return ans;
    }
}
