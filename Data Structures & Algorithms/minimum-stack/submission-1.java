class MinStack {
    Stack<Integer> min_stack,main_stack;
    public MinStack() {
        min_stack=new Stack<>();
        main_stack=new Stack<>();
    }
    
    public void push(int val) {
        main_stack.push(val);
        if(min_stack.isEmpty() || min_stack.peek()>=val)
            min_stack.push(val);
    }
    
    public void pop() {
        int val=main_stack.pop();
        if(!min_stack.isEmpty() && min_stack.peek()==val)
            min_stack.pop();
    }
    
    public int top() {
        return main_stack.peek();

    }
    
    public int getMin() {
        return min_stack.peek();
    }
}
