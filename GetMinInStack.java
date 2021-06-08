class MinStack {
    Stack<Integer> st ;
    
    public MinStack() {
        st  = new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        int n = st.size();
        int [] arr = new int [st.size()];
        int min = st.peek();
        for(int i=st.size()-1;i>=0;i--){
            arr[i] = st.pop();
            if(arr[i] < min)
                min = arr[i];
        }
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
