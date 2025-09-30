class MyStack {
    Stack <Integer> stack=new Stack<>();

    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
      return  stack.pop();
        
    }
    
    public int top() {
        return stack.peek();

    }
    
    public boolean empty() {
        if(!stack.isEmpty()){
            return false;
        }
    return true;
    }
}
        