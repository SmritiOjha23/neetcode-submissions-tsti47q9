class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        if(nums.length<2)
            return nums.length;
        for(int num:nums)
            hs.add(num);
        int ans=1;
        for(int num: hs)
        {
            if(!hs.contains(num-1))
            {
                int streak=1;
                int curr=num;
                while(hs.contains(num+1))
                {
                    streak++;
                    num=num+1;
                }
                ans=Math.max(ans,streak);
            }

        }
        return ans;
    }
}
