class Solution {
    class Node
    {
        int val,index;
        Node(int val, int index)
        {
            this.val=val;
            this.index=index;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Node> st=new Stack<>();
        int n=temperatures.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek().val<=temperatures[i])
            {
                st.pop();
            }
            
            ans[i]=st.isEmpty()?0:st.peek().index-i;
            st.push(new Node(temperatures[i],i));
        }
        return ans;
    }
}
