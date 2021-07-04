class Solution {
    public String reverseWords(String s) {
        Stack<Character> st = new Stack<Character>();
        String t = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                while(!st.isEmpty()){
                    t = t + st.pop();
                }
                t = t + " ";
            }
            else{
                st.push(ch);
            }
        }
        //t = t + " ";
        while(!st.isEmpty()){
            t = t + st.pop();
        }
        return t;
    }
}
