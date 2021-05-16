import java.util.*;


class TestClass {

    public static void main(String args[] ) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int c=0;
        String s1 = sc.next();
        String s2 = sc.next();
        StringBuffer sb1 = new StringBuffer(s1);
        StringBuffer sb2 = new StringBuffer(s2);
        for(int i=0;i<len;i++){
            s1 = sb1.toString();
            s2 = sb2.toString();
            if(s1.equals(s2)){
              break;  
            }
            else{
            sb1.deleteCharAt(0);
            sb2.deleteCharAt(sb2.length()-1);
            c++;}
        }
        System.out.println(c);
    }
}
// https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/rotation-1-38ecf5a7/
