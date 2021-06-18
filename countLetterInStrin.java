class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.equals(""))
            return 0;
        else{
            int c = 1;
            String t = "";
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == ' '){
                    if(!t.equals(""))
                    c++;
                    t = "";
                }
                else
                    t = t +""+ s.charAt(i);
            }
            return c;
        }
    }
}
