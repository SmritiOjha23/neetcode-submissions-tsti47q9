class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String s:operations)
        {
            if(s.equals("+"))
            {
                int b=st.pop();
                int a=st.pop();
                int temp=a+b;
                st.push(a);
                st.push(b);
                st.push(temp);
            }
            else if(s.equals("D"))
            {
                int a=st.pop();
                int temp=2*a;
                st.push(a);
                st.push(temp);
            }
            else if(s.equals("C"))
                st.pop();
            else
                st.push(Integer.parseInt(s));
        }
        int ans=0;
        while(!st.isEmpty())
        {
            ans+=st.pop();
        }
        return ans;
    }
}