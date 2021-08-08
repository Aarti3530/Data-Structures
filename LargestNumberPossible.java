class Solution{
    static String findLargest(int N, int S){
        if(S == 0 && N-1 > S){
             return "-1";
        }
        String s = "";
        while(N-->0){
            if(S >= 9){
                s = s + 9;
                S = S - 9;
            }else{
                s = s + S;
                S = 0;
            }
        }
        if(S == 0)
        return s;
        return "-1";
    }
}
