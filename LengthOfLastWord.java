class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        s = new StringBuilder(s).reverse().toString();
        int c = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' ')
                break;
            else
                c++;
        }
        return c;
    }
}
