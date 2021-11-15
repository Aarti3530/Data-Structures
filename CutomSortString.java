class Solution {
    public String customSortString(String order, String s) {
      String res = "";
      for(int i=0;i<order.length();i++){
          String ch = ""+order.charAt(i);
          int t = s.length() - s.replaceAll(ch,"").length();
          res = res + ch.repeat(t);
      }
        for(int i=0;i<s.length();i++){
            if(!order.contains(""+s.charAt(i))){
                res = res + s.charAt(i);
            }
        }
        return res;
    }
}
