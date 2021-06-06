// { Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            long n = Integer.parseInt(br.readLine().trim());

            String url = new Solution().idToShortURL(n);
            System.out.println(url);
            System.out.println(shortURLtoID(url));
        }
    }

    // Function to get integer ID back from a short url
    static long shortURLtoID(String shortURL) {
        long id = 0; // initialize result

        // A simple base conversion logic
        for (int i = 0; i < shortURL.length(); i++) {
            if ('a' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'z')
                id = id * 62 + shortURL.charAt(i) - 'a';
            if ('A' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= 'Z')
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            if ('0' <= shortURL.charAt(i) &&
                    shortURL.charAt(i) <= '9')
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
        }
        return id;
    }
}
// } Driver Code Ends


class Solution {
    String idToShortURL(int n) {
        char [] map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        StringBuffer s = new StringBuffer();
        while(n > 0){
            s.append(map[(int)n%62]);
            n =  n/62;
        }
        s.reverse();
        return s.toString();
    }
}
