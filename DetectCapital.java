class Solution {
    public boolean detectCapitalUse(String word) {
        char ch = word.charAt(0);
        if(Character.isLowerCase(ch)){
            for(int i=1;i<word.length();i++){
                ch = word.charAt(i);
                if(!Character.isLowerCase(ch)) return false;
            }
            return true;
        }else{
            boolean up=false,low=false;
            for(int i=1;i<word.length();i++){
                ch = word.charAt(i);
                if(Character.isLowerCase(ch)){
                    low = true;
                    if(up != false) return false;
                }
                else{
                    up = true;
                }
            }
            if(low && up) return false;
            return true;
        }
    }
}
