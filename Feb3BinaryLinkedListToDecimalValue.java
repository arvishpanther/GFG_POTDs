//{ Driver Code Starts
import java.util.*;
//} Driver Code ends

//Answer
class Solution{
   long DecimalValue(Node head){
        if(head==null){
           return 0;
 	    }
 	  //  Node temp=head;
 	  //  int count=-1;
 	  //  while(head!=null){
 	  //      ++count;
 	  //      head=head.next;
 	  //  }
 	    
 	    long val=0;
 	    while(head!=null){
 	      //  val=(val+(long)(Math.pow(2,count)*temp.data)%1000000007)%1000000007;
 	        val=(val*2)%1000000007+head.data;
 	        head=head.next;
 	      //  count--;
 	    }
 	  //  System.out.println(count);
 	    return val;
   }
}
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */
//_____________________________________________________________________________________
//{ Driver Code Starts
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class LinkedList1
{
    Node head;  // head of lisl
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }
    /* Function to print linked list */
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        String s = sc.nextLine();
        while(t>0)
        {
            int n = sc.nextInt();
            String s1 = sc.nextLine();
            LinkedList1 llist = new LinkedList1();

            if (n > 0)
            {
                int a1=sc.nextInt();
                Node head= new Node(a1);
                llist.addToTheLast(head);
            }
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }
            System.out.println(new Solution().DecimalValue(llist.head));
            t--;
        }
    }
}
// } Driver Code Ends
