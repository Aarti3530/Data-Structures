class Solution {
    public String reverseWords(String s) {
        String t = "";
        Stack<String> st = new Stack<String>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                if(!t.equals(""))
                st.push(t);
                t = "";
            }
            else
                t = t + ch;
        }
        st.push(t);
        t = "";
        while(!st.isEmpty()){
            t = t + st.pop();
            t = t + " ";
        }
        return t;
    }
}
