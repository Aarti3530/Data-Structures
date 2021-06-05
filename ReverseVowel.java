class Solution {
    public String reverseVowels(String s) {
        String vowel = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowel = vowel + "" + ch;
            else  if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                vowel = vowel + "" + ch;
        }
        vowel = new StringBuilder(vowel).reverse().toString();
        int c = 0;
        String t = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                t = t + "" + vowel.charAt(c++);
            else  if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                t = t + "" + vowel.charAt(c++);
            else
                t = t + "" + s.charAt(i);
        }
        return t;
    }
}
