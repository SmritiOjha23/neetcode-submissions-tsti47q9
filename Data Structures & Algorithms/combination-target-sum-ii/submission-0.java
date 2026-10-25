class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        HashSet<List<Integer>> hs=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        Arrays.sort(candidates);
        solve(ans,hs,candidates,target,0,output);
        return ans;
    }
    public void solve(List<List<Integer>> ans,HashSet<List<Integer>> hs,int[] candidates, int target, int index, List<Integer> output)
    {
        if(target==0)
        {
            if(!hs.contains(output))
            {
                hs.add(output);
                ans.add(output);
            }
            
        }
        if(target<0 || index==candidates.length)
            return;
        solve(ans,hs,candidates,target,index+1,output);
        List<Integer> include=new ArrayList<>(output);
        include.add(candidates[index]);
        solve(ans,hs,candidates,target-candidates[index],index+1,include);
    }
}