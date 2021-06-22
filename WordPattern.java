class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] arr = s.split(" ");
        HashMap<Character,String> h = new HashMap<Character,String>();
        for(int i=0,j=0;i<pattern.length() && j<arr.length;i++,j++){
            if(!h.containsValue(arr[j]))
            h.put(pattern.charAt(i),arr[j]);
        }
        String t = "";
        for(int i=0;i<pattern.length();i++){
            t = t + h.get(pattern.charAt(i));
            t = t + " ";
        }
         t = t.trim();
        if(t.equals(s))
            return true;
        return false;
    }
}
