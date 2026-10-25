class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int p[]=intervals[0];
        ArrayList<int[]> merged=new ArrayList<>();
        for(int i=1;i<intervals.length;i++)
        {
            if(p[1]>=intervals[i][0])
            {
                p[1]=Math.max(p[1],intervals[i][1]);
            }
            else
            {
                merged.add(p);
                p=intervals[i];
            }
            
        }
        merged.add(p);
        return merged.toArray(new int[merged.size()][]);
    }
}
