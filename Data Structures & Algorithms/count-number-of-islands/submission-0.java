class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    ans+=1;
                }
            }
        }
        return ans;
    }
    public void dfs(char[][] grid, int i, int j)
    {
        int r=grid.length;
        int c=grid[0].length;
        if(i>=r||j>=c||i<0||j<0||grid[i][j]!='1')
            return;
        grid[i][j]='2';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
