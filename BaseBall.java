class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<ops.length;i++){
            String s = ops[i];
            if(s.equals("+")){
                int num1 = st.pop();
                int num2 = st.pop();
                st.push(num2);
                st.push(num1);
                st.push(num1 + num2);
            }
            else if(s.equals("D")){
                int num1 = st.peek();
                st.push(num1 * 2);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else{
                int num = Integer.valueOf(s);
                st.push(num);
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
