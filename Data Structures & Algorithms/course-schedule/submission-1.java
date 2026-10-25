class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int p[]: prerequisites)
        {
            adj.get(p[1]).add(p[0]);
        }
        int state[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(state[i]==0)
                if(!dfs(adj,i,state))
                    return false;
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adj,int i, int state[])
    {
        state[i]=1;
        for(int node: adj.get(i))
        {
            if(state[node]==1)
                return false;
            if(state[node]==0)
                if(!dfs(adj,node,state))
                    return false;
        }
        state[i]=2;
        return true;
    }
}
