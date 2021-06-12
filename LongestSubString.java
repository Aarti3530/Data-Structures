class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> h = new HashSet<Character>();
        if(s.equals(""))
            return 0;
        int m=0;
        int p1=0,p2=0;
        while(p1<s.length()){
            if(!h.contains(s.charAt(p1))){
                h.add(s.charAt(p1));
                p1++;
            }else{
                while(h.contains(s.charAt(p1)))
                h.remove(s.charAt(p2++));
            }
            m = Math.max(m,p1-p2);
        }
        return m;
    }
}
