class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->((a[0]*a[0])+(a[1]*a[1]))-((b[0]*b[0])+(b[1]*b[1])));
        for(int p[]:points)
        {
            pq.offer(p);
        }
        int[][] ans=new int[k][2];
        int i=0;
        while(k-->0)
        {
            int p[]=pq.poll();
            ans[i][0]=p[0];
            ans[i][1]=p[1];
            i++;
        }
        return ans;
    }
}
