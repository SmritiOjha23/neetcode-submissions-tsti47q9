class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int p:piles)
            high=Math.max(high,p);
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(canFinish(piles,mid,h))
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    public boolean canFinish(int[] piles, int mid,int h)
    {
        long sum=0;
        for(int p:piles)
            sum+=(long)Math.ceil((double)p/mid);
        return sum<=h;
    }
}
