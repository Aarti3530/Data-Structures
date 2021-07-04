class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        String t = "";
        char []ch = s.toCharArray();
        for(char a:ch){
            if(a == '('){
                c++;
                if(c>1)
                    t = t + a;
            }
            if(a == ')'){
                c--;
                if(c>=1)
                    t = t + a;
            }
        }
        return t;
    }
}
