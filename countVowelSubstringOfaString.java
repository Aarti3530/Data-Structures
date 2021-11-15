class Solution {
    public boolean vowels(String s){
        //System.out.print(s+" ");
        int sum = 0;
        if(s.contains("a") && s.contains("e") && s.contains("i") && 
          s.contains("o") && s.contains("u")){
        int a = s.length() - s.replaceAll("a","").length();
       // System.out.println(a);
        int e = s.length() - s.replaceAll("e","").length();
        int i = s.length() - s.replaceAll("i","").length();
        int o = s.length() - s.replaceAll("o","").length();
        int u = s.length() - s.replaceAll("u","").length();
        sum = a+e+i+o+u;
        }
        if(sum == s.length()) return true;
        else return false;
    }
    public int countVowelSubstrings(String word) {
        int l = 0,m = word.length()-1;
        int h = 5,c = 0;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' 
               || word.charAt(i) == 'i' || word.charAt(i) == 'o' 
               || word.charAt(i) == 'u') {
                l = i;
                break;
            } 
        }
        for(int i = word.length()-1;i>=0;i--){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' 
               || word.charAt(i) == 'i' || word.charAt(i) == 'o' 
               || word.charAt(i) == 'u') {
                m = i;
                break;
            } 
        }
        //System.out.println(l+" "+m);
        for(int i=l;i<word.length();i++){
            h = i+5;
            //System.out.println(" "+h+" ");
            while(h <= m+1){
                if(vowels(word.substring(i,h)))
                c++;
                h++;
            }
        }
        return c;
    }
}

//https://leetcode.com/problems/count-vowel-substrings-of-a-string/
