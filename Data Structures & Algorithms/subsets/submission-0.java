class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        solve(nums, ans, new ArrayList<>(), 0);
        return ans;

    }
    public void solve(int nums[], List<List<Integer>> ans, List<Integer> output, int index)
    {
        if(index==nums.length)
        {
            ans.add(output);
            return;
        }
        solve(nums, ans, output, index+1);
        List<Integer> include=new ArrayList<>(output);
        include.add(nums[index]);
        solve(nums,ans,include, index+1);
    }
}
