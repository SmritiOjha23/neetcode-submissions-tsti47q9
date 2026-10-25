class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int left=0;
        int n=nums.length;
        for(int right=0;right<n;right++)
        {
            if(hs.contains(nums[right]))
                    return true;
            hs.add(nums[right]);
            if(right-left+1>k)
            {
                hs.remove(nums[left]);
                left++;
            }
            
        }
        return false;
    }
}