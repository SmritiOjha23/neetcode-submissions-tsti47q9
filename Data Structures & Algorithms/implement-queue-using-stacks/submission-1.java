class MyQueue {
    Stack<Integer> inStack,outStack;
    public MyQueue() {
        inStack=new Stack<>();
        outStack=new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        while(inStack.size()!=1)
            outStack.push(inStack.pop());
        int pop=inStack.pop();
        while(!outStack.isEmpty())
            inStack.push(outStack.pop());
        return pop;
    }
    
    public int peek() {
        while(inStack.size()!=1)
            outStack.push(inStack.pop());
        int peek=inStack.peek();
        while(!outStack.isEmpty())
            inStack.push(outStack.pop());
        return peek;
    }
    
    public boolean empty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */