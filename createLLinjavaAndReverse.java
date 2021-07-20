import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
    Node(){
 
    }
}
 
class TestClass {
    public static void reverse(Node node,int c){
        Node p = node;
        Stack<Integer> l = new Stack<>();
        while(p!=null && c-->0){
           l.push(p.data);
           p = p.next;
        }
        p = node;
        while(!l.isEmpty()){
            p.data = l.pop();
            p = p.next;
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);               
        int n = sc.nextInt();
        Node node = new Node(0);
        Node p = node;
        for(int i=0;i<n;i++){
           int t = sc.nextInt();
           node.next = new Node(t);
           node = node.next;
        }
        Node x = p.next;
        node = null;
        int c=0;
        while(x!=null){
            if(x.data%2 == 0 && node==null){
                node = x;
                c++;
            }else if(x.data%2 == 0 && node != null){
                c++;
            }else{
               if(node!=null && c!=0)
               reverse(node,c);
               c = 0;
               node = null;
            }
            x = x.next;
        }
        if(node!=null && c!=0){
            reverse(node,c);
        }
        x = p.next;
        while(x!=null){
            System.out.print(x.data+" ");
            x = x.next;
        }
    }
}
