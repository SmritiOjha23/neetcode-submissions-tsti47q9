class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans=Math.max(ans,dfs(grid,i,j));
            }
        }
        return ans;
    }
    public int dfs(int[][] grid, int i, int j)
    {
        int count=0;
        int r=grid.length;
        int c=grid[0].length;
        if(i>=r || j>=c ||i<0 ||j<0 || grid[i][j]!=1)
            return 0;
        grid[i][j]=2;
        count= dfs(grid,i+1,j)+dfs(grid,i,j+1)+dfs(grid,i-1,j)+dfs(grid,i,j-1)+1;
        return count;
    }
}
