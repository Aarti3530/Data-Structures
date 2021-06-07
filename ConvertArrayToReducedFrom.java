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
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().convert(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

class Solution {
    void convert(int[] arr, int n) {
        int [] temp =  new int[n];
        for(int i=0;i<n;i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>(n);
        int c = 0;
        for(int i:temp){
            h.put(i,c++);
        }
        for(int i=0;i<n;i++){
            if(h.containsKey(arr[i]))
            arr[i] = h.get(arr[i]);
        }
    }
}
