// { Driver Code Starts
//

import java.io.*;
import java.util.*;

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

class GfG
{
    static Scanner sc = new Scanner(System.in);
    
    public static Node inputList(int size)
    {
        Node head, tail;
        int val;
        
        val = sc.nextInt();
        head = tail = new Node(val);
        
        size--;
        while(size-->0)
        {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        
        return head;
    }
    
    public static void printList(Node n)
    {
        while(n!=null)
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public static void main(String args[])
    {
        int t = sc.nextInt();
        while(t-->0)
        {
            int n , m;
            
            n = sc.nextInt();
            Node head1 = inputList(n);
            
            m = sc.nextInt();
            Node head2 = inputList(m);
            
            Solution obj = new Solution();
            
            Node result = obj.findIntersection(head1, head2);
            
            printList(result);
            System.out.println();
        }
    }
}
// } Driver Code Ends

/*
class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}
*/

class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        Node t1=head1,t2=head2;
        Node t,n;
        t = n = new Node(0);
        HashSet<Integer> h = new HashSet<Integer>();
        
        while(t2!=null){
            h.add(t2.data);
            t2 = t2.next; 
        }
        //System.out.println(h);
        while(t1!=null){
            if(h.contains(t1.data)){
                t.next = new Node(t1.data);
                t = t.next;
            }
            t1 = t1.next;
        }
        //t=n;
        n = n.next;
        return n;
    }
}
