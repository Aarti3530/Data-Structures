class Solution {
    public String longestCommonPrefix(String[] strs) {
        String t = strs[0];
        for(int i=1;i<strs.length;i++){
            String temp = strs[i];
            String c = "";
            for(int j=0;j<temp.length() && j<t.length();j++){
                if(temp.charAt(j) == t.charAt(j)){
                    c = c + temp.charAt(j);
                }else break;
            }
            if(c.length() > 0)
                t = c;
            else return "";
        }
        return t;
    }
}
