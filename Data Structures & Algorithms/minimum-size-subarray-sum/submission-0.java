class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int n=nums.length;
        int ans = Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<n;right++)
        {
            sum+=nums[right];
            while(left<n&&sum>=target)
            {
                sum=sum-nums[left];
                ans=Math.min(ans,right-left+1);
                left++;
            }
            
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}