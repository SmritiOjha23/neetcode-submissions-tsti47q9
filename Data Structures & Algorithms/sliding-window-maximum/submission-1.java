class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int left=0, n=nums.length, index=0;
        int ans[]=new int[n-k+1];
        for(int right=0;right<n;right++)
        {
            pq.offer(nums[right]);
            while(right-left+1>k)
            {
                pq.remove(nums[left]);
                left++;
            }
            if(right-left+1==k)
                ans[index++]=pq.peek();
        }
        return ans;
    }
}