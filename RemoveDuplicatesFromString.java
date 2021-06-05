import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      LinkedHashSet<Character> h = new LinkedHashSet<Character>();
      for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
         if(h.contains(ch))
         continue;
         else
         h.add(ch);
      }
      for(Character h1 : h){
        System.out.print(h1);
      }
      
   }
}
