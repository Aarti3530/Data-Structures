class Solution {
    public String reverseStr(String s, int k) {
        if(s.length() <= k){
            return new StringBuilder(s).reverse().toString();
        }
        char []ch = s.toCharArray(); 
        for(int i=0;i<ch.length;i = i+2*k){
            if(k+i-1<ch.length){
            int p=i,q = k+i-1;
            while(p<q){
                char c = ch[p];
                ch[p] = ch[q];
                ch[q] = c;
                p++;q--;
            }
            }else{
               int p=i,q = ch.length-1;
            while(p<q){
                char c = ch[p];
                ch[p] = ch[q];
                ch[q] = c;
                p++;q--;
            }                 

            }
        }
        s = String.valueOf(ch);
        return s;
    }
}
