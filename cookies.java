class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int p=0,q=0;
        int c = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(;p<g.length && q<s.length;){
            if(s[q] >= g[p]){
                p++;
                q++;
                c++;
            }
            else if(g[p]>s[q]){
                q++;
            }
        }
        return c;
    }
}
