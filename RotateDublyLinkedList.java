// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node prev, next;
    
    public Node (int d){
        this.data = d;
        prev = null;
        next = null;
    }
}

public class doubly_LL {
    
    static void display(Node node){
        while(node != null){
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.println();
    }
    

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int p = sc.nextInt();
		       
		    //Entering the data
		    Node head = new Node(sc.nextInt());
		    Node curr = head;
		    
		    //Entering the rest of the list
		    for(int i=0; i<n-1; i++){
		        int d = sc.nextInt();
		        curr.next = new Node(d);
		        curr = curr.next;
		    }
            
            Gfg obj = new Gfg();
            display(obj.rotateP(head, p));
		}
	}

}
// } Driver Code Ends



class Gfg {
    Node rotateP (Node head, int p){
        Node s = head,t = head;
        int x = p;
        Node e = s;
        while(p-->0){
            e = s;
            s = s.next;
        }
        e.next = null;
        s.prev = null;
        head = s;
        while(s.next!=null){
            s = s.next;
        }
        s.next = t;
        t.prev = s;
        return head;
    }
}
