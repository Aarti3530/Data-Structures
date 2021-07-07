class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> st = new Stack<Character>();
        //st.push('A');
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else{
            if(st.isEmpty()) return false;
            if(st.peek() == '(' && ch != ')')   return false;
            if(st.peek() == '{' && ch != '}')   return false;
            if(st.peek() == '[' && ch != ']')   return false;
                st.pop();
            }
            
        }
        if(st.size()==0) return true;
        return false;
    }
}
