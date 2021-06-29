class Solution {
    public char findTheDifference(String s, String p) {
        int t = 0,i;
        for(i=0;i<s.length();i++){
            t = t ^ s.charAt(i) ^ p.charAt(i);
        }
        t = t ^ p.charAt(i);
        char ch = (char) t;
        return ch;
    }
}
