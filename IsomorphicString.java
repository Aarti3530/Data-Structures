class Solution {
    public String call(String s){
        Map<Character,Integer> h = new HashMap<>();
        String t = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!h.containsKey(ch))
                h.put(ch,i);
            t = t + h.get(ch); 
        }
        return t;
    }
    public boolean isIsomorphic(String s, String t) {
       if(call(s).equals(call(t))) 
           return true;
        else
            return false;
    }
}
