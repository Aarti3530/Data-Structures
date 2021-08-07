class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!h.containsKey(ch)){
                h.put(ch,1);
            }else{
                h.put(ch,h.get(ch)+1);
            }
        }
        int c = 0;
        int odd = 0;
        for(Map.Entry<Character,Integer> entry:h.entrySet()){
            if(entry.getValue()%2 == 0){
                c = c + entry.getValue();
            }else{
                odd++;
                    c = c + entry.getValue()-1;
            }
        }
        if(odd >= 1) c++;
        return c;
    }
}
