class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        for(String s:words){
            if(isGood(s,chars)) sum = sum + s.length();
        }
        return sum;
    }
    public boolean isGood(String t,String s){
        int [] arr = new int[26];
        for(int i=0;i<t.length();i++){
            arr[t.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i] > 0) return false;
        }
        return true;
    }
}

/*You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.*/
