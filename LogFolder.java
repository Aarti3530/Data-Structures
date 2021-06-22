class Solution {
    public int minOperations(String[] logs) {
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<logs.length;i++){
            String s = logs[i];
            if(s.equals("./"))
                continue;
            else if(s.equals("../")){
                if(!st.isEmpty())
                    st.pop();
            }
                
            else
                st.push('a');
        }
        return st.size();
    }
}
