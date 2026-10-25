class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int freq[]=new int[n*n+1];
        int ans[]=new int[2];
        int flag=0;
        for(int row[]:grid)
        {
            for(int ele:row)
            {
                freq[ele]+=1;
                if(freq[ele]==2)
                {
                    ans[0]=ele;
                }
            }
        }
        for(int i=1;i<n*n+1;i++)
        {
            if(freq[i]==0)
            {
                ans[1]=i;
                break;
            }     
        }
        return ans;
    }
}