class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();
        for(String i:tokens){
            if(i.equals("+")|| i.equals("-")|| i.equals("*")|| i.equals("/")){
                int b = st.pop(); //second
                int a = st.pop();  //first
                int res = 0;
                if(i.equals("+"))res=a+b;
                else if(i.equals("-"))res = a-b;
                else if(i.equals("*"))res = a*b;
                else res = a/b;
                st.push(res);
                
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.pop();
    }
}