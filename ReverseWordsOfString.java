import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    Stack<String> st = new Stack<String>();
	    String temp =  "";
	    for(int i=0;i<s.length();i++){
	        char ch = s.charAt(i);
	        if(Character.isLetter(ch)){
	            temp = temp+""+ch;
	        }
	        if(ch == ' '){
	           st.push(temp);
	           temp = "";
	        }
	    }
	    st.push(temp);
	    
	    while(!st.isEmpty()){
	        String t = st.peek();
	        System.out.print(t+" ");
	        st.pop();
	    }
	}
}
