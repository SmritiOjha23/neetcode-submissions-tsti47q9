class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int n:nums)
            mp.put(n,mp.getOrDefault(n,0)+1);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(mp.get(b)-mp.get(a)));
        for(int n:mp.keySet())
            pq.offer(n);
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll();
        }
        return ans;
    }
}
