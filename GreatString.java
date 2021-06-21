class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<Character>();
        st.push('+');
        st.push('+');
        for(int i=0;i<s.length();i++){
                if((st.peek() == s.charAt(i)-32) && st.size() > 2){
                    
                    st.pop();
                }
                else if((st.peek() == s.charAt(i)+32) && st.size() > 2){
                      st.pop();
                }
                else{
                    st.push(s.charAt(i));
                   // System.out.print(st.peek());
                }
           
        }
        
        String t = "";
        while(st.peek() != '+'){
            t = t + "" + st.pop();
        }
        t = new StringBuilder(t).reverse().toString();
        return t;
    }
}
