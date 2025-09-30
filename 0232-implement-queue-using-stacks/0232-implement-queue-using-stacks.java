class MyQueue {
Stack<Integer>s1;
Stack<Integer>s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {            //insertion O(n)
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {                   //removal O(1)
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}




// class MyQueue {
// Stack<Integer>s1;
// Stack<Integer>s2;
//     public MyQueue() {
//         s1 = new Stack<>();
//         s2 = new Stack<>();
//     }
    
//     public void push(int x) {           //insertion    O(1)
//         s1.push(x);
//     }
    
//     public int pop() {
//         while(!s1.isEmpty()){               //removal O(n)
//             s2.push(s1.pop());

//         }
//         int remove = s2.pop();

//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//         return remove;
//     }
    
//     public int peek() {
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());

//         }
//         int peeked = s2.peek();

//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
//         return peeked;
//     }
    
//     public boolean empty() {
//         return s1.isEmpty();
//     }
// }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */