class Solution {
    public int firstMissingPositive(int[] nums) {
        int index=0;
        Arrays.sort(nums);
        for(int num:nums)
        {
            if(num>0)
                nums[index++]=num;
        }
        int k=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[k])
            {
                nums[++k]=nums[i];
            }
        }
        for(int i=0;i<Math.min(k+1,index+1);i++)
        {
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums[k]+1;
    }
}