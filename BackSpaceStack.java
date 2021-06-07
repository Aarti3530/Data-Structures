class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<Character>();
        Stack<Character> st2 = new Stack<Character>();
        st1.push('+');
        st2.push('+');
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '#' && st1.peek()!= '+')
                st1.pop();
            else if(ch != '#')
                st1.push(ch);
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch == '#' && st2.peek()!='+')
                st2.pop();
            else if(ch != '#')
                st2.push(ch);
        }
        if(st1.size() != st2.size())
            return false;
        else{
            while(!st1.isEmpty()){
                if(st1.pop() != st2.pop())
                    return false;
            }
        }
        return true;
    }
}
