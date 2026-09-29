class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expected_sum=(n*(n+1))/2;
        int current_sum=0;
        for(int num:nums)
            current_sum+=num;
        return expected_sum-current_sum;
    }
}
