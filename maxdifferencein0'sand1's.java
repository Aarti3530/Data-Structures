class Solution {
    int maxSubstring(String S) {
        int c=0,x=0,max = -1;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='0'){
            c++;
            if(c > max) max = c;
            continue;
            }
            else
            c--;
            if(c < 0) 
            c = 0;
            
        }
        return max;
    }
}
