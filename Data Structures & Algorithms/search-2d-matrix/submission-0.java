class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(target>=matrix[i][0] && target<=matrix[i][m-1])
                {
                    int low=0;
                    int high=m-1;
                    while(low<=high)
                    {
                        int mid=(low+high)/2;
                        if(target==matrix[i][mid])
                            return true;
                        else if(target<matrix[i][mid])
                            high=mid-1;
                        else
                            low=mid+1;
                    }
                }
            }
        }
        return false;
    }
}
