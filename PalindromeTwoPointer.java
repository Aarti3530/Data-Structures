class Solution {
    public boolean isPalindrome(String s) {
          String t = "";
          s = s.toLowerCase();
          for(int i=0;i<s.length();i++){
              char ch = s.charAt(i);
              if(ch >= 'a' && ch <= 'z'){
                  t = t + ch;
              }else if(ch >= '0' && ch <= '9'){
                  t = t + ch;
              }
          }
        int p=0,q=t.length()-1;
        while(p<q){
            if(t.charAt(p) != t.charAt(q)){
                return false;
            }p++; q--;
        }
        return true;
    }
}
