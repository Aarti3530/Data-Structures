import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = "";
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<s.length();i++){
		    char ch = s.charAt(i);
		    if(ch == ' '){
		       while(!st.isEmpty()){
		           t = t + st.peek();
		           st.pop();
		       }
		       t = t + " ";
		    }
		    if(Character.isLetter(ch)){
		        st.push(ch);
		    }
		}
			       while(!st.isEmpty()){
		           t = t + st.peek();
		           st.pop();
	 }
	 System.out.println(t);
	}
}
