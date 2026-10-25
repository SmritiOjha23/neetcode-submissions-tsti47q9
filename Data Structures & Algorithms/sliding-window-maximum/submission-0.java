class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int max=nums[0];
        int left=0;
        int n=nums.length;
        int i=0;
        int ans[]=new int[n-k+1];
        for(int right=0;right<nums.length;right++)
        {
            pq.offer(nums[right]);
            while(right-left+1>k)
            {
                pq.remove(nums[left]);
                left++;
            }
             if (right - left + 1 == k) {
                ans[i++] = pq.peek();
            }
        }
        return ans;
    }
}
