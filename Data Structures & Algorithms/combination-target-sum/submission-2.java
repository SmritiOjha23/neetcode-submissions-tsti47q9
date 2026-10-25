class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        solve(nums,ans,output,target,0);
        return ans;
    }
    public void solve(int[] nums,List<List<Integer>> ans, List<Integer> output, int target, int i)
    {
        if(target==0)
        {
            ans.add(output);
            return;
        }
        if(target<0)
            return;
        if (i == nums.length) return;
        solve(nums,ans,output,target,i+1);
        List<Integer> include=new ArrayList<>(output);
        include.add(nums[i]);
        solve(nums,ans,include, target-nums[i],i);
    }
}
