class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String token:tokens)
        {
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
            {
                int temp=0;
                int b=st.pop();
                int a=st.pop();
                if(token.equals("+"))
                    temp=a+b;
                if(token.equals("-"))
                    temp=a-b;
                if(token.equals("*"))
                    temp=a*b;
                if(token.equals("/"))
                    temp=a/b;
                st.push(temp);
            }
            else
                st.push(Integer.parseInt(token));
        }
        return st.peek();
    }
}
