class Solution {
    public int countComponents(int n, int[][] edges) {
        int visited[]=new int[n];
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int edge[]:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(visited[i]!=1)
            {
                dfs(adj,visited,i);
                ans+=1;
            }
        }
        return ans;
    }
    public void dfs(List<List<Integer>> adj, int[] visited, int node)
    {
        for(int i: adj.get(node))
        {
            if(visited[i]!=1)
            {
                visited[i]=1;
                dfs(adj,visited,i);
            }
        }
    }
}
