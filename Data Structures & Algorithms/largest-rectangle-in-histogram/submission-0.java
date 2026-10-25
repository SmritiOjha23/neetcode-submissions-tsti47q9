class Solution {
    class Node{
        int val, index;
        Node(int val, int index)
        {
            this.val=val;
            this.index=index;
        }
    }
    public int largestRectangleArea(int[] heights) {
        Stack<Node> st=new Stack<Node>();
        int n=heights.length;
        int nsl[]=new int[n];
        int nsr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && st.peek().val>=heights[i])
                st.pop();
            nsl[i]=st.isEmpty()?-1:st.peek().index;
            st.push(new Node(heights[i],i));
        }
        st.clear();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek().val>=heights[i])
            {
                st.pop();
            }
            nsr[i]=st.isEmpty()?n:st.peek().index;
            st.push(new Node(heights[i],i));
        }
        int max_area=0;
        for(int i=0;i<n;i++)
        {
            int width=nsr[i]-nsl[i]-1;
            int area=width*heights[i];
            max_area=Math.max(max_area,area);
        }
        return max_area;
    }
}
