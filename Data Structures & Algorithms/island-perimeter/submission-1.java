class Solution {
    public int islandPerimeter(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    return mark(grid,i,j);
                }
            }
        }
        return ans;
    }
    private int mark(int[][] grid, int i, int j)
    {
        int r=grid.length;
        int c=grid[0].length;
        if(i>=r ||i <0 || j<0 ||j>=c || grid[i][j]==0)
            return 1;
        if(grid[i][j]==2)
            return 0;
        grid[i][j]=2;
        return mark(grid,i+1,j)+mark(grid,i-1,j)+mark(grid,i,j+1)+mark(grid,i,j-1);
    }
}