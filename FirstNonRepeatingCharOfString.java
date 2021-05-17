class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        HashMap<Character,Integer> h = new HashMap<Character,Integer>(S.length());
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(h.containsKey(ch)){
                h.put(ch,h.get(ch)+1);
            }
            else
            h.put(ch,1);
        }

        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(h.get(ch) == 1)
            return ch;
        }
        
        return '$';
    }
}
