class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int diff= Math.abs(a-x)-Math.abs(b-x);
            if(diff!=0)
                return diff;
            return a-b;
    });
        for(int a:arr)
            pq.offer(a);
        List<Integer> ans=new ArrayList<>();
        while(k-->0)
            ans.add(pq.poll());
        Collections.sort(ans);
        return ans;

    }
}