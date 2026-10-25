class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int n=nums.length;
        int max_sum=Integer.MAX_VALUE;
        int sum=0;
        for(int right=0;right<n;right++)
        {
            sum=sum+nums[right];
            while(sum>=target)
            {
                sum=sum-nums[left];
                
                
                max_sum=Math.min(max_sum,right-left+1);
                left++;
            }
        }
        return max_sum==Integer.MAX_VALUE?0:max_sum;
    }
}