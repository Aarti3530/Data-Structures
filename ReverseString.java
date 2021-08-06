class Solution {
    public String reverseWords(String s) {
        Stack<Character> st = new Stack<Character>();
        String t = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ' '){
                while(!st.isEmpty()){
                    t = t + st.pop();
                }
                t = t + " ";
            }
            else{
                st.push(ch);
            }
        }
        //t = t + " ";
        while(!st.isEmpty()){
            t = t + st.pop();
        }
        return t;
    }
}
// using recursiong

import java.util.Scanner;
public class Main
{
  public static String reverse (String s)
  {
    if (s.length () == 1)
      return "" + s.charAt (s.length () - 1);
    else return "" + s.charAt (s.length () - 1) +
	reverse (s.substring (0, s.length ()-1));
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String s = sc.next ();
    String res = reverse (s);
    System.out.println(res);
  }
}
