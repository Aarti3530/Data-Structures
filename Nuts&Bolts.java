// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
        char [] ch = new char []{'!','#','$','%','&','*','@','^','~'};
        HashSet<Character> s1 = new HashSet<Character>();
        HashSet<Character> s2 = new HashSet<Character>();
        for(int i=0;i<n;i++){
            s1.add(nuts[i]);
        }
        for(int i=0;i<n;i++){
            s2.add(bolts[i]);
        }
        int j=0;
        for(int i=0;i<9;i++){
            if(s1.contains(ch[i]) && s2.contains(ch[i])){
                nuts[j] = ch[i];
                bolts[j] = ch[i];
                j++;
            }
        }
    }
}
