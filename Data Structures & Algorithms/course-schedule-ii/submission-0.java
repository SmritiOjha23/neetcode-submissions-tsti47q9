class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++)
            adj.add(new ArrayList<>());
        for(int[] p: prerequisites)
            adj.get(p[1]).add(p[0]);
        Stack<Integer> st=new Stack<>();
        int state[]=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(state[i]==0)
                if(!dfs(adj,state,i,st))
                    return new int[0];
        }
        int ans[]=new int[st.size()];
        int i=0;
        while(!st.isEmpty())
        {
            ans[i]=st.pop();
            i++;
        }
        return ans;
    }
    public boolean dfs(List<List<Integer>> adj, int state[], int node, Stack<Integer> st)
    {
        state[node]=1;
        for(int i:adj.get(node))
        {
            if(state[i]==1)
                return false;
            if(state[i]==0)
                if(!dfs(adj,state,i,st))
                    return false;
        }
        state[node]=2;
        st.push(node);
        return true;
    }
}
