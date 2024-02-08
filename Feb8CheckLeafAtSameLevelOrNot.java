import java.util.*;
import java.lang.*;
import java.io.*;

//My User Code
class Solution
{   int height=1;
    boolean flag=true;
    boolean firstLeaf=false;
    boolean isLeaf(Node node){
        return node.left==null?node.right==null:false;
    }
    boolean check(Node root){
	    // Your code here
	   checkLeaves(root,1);
	    return flag;
    }
    void checkLeaves(Node node, int height) {
        // base case
        if (node == null||!flag) {
          return;
        }
        if (isLeaf(node)) {
        //   System.out.print(node.data);
            if(this.height==1){
                this.height=height;
            }
            // if(!firstLeaf){
            //     this.height=height;
            // }
            else if(this.height!=height){
                flag=false;
                // System.out.print(node.data+"@"+height);
                return;
            }
        }
        checkLeaves(node.left,height+1);
        checkLeaves(node.right,height+1);
    }
}
//my User code ends
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
//{ Driver Code Starts
// INITIAL CODE
class Is_Leaves_At_Same_Level
{
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }  
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }

    // driver function to test the above functions
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t > 0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
        
            Solution g = new Solution();
	    	boolean b = g.check(root);
		   	if(b == true)
		    	System.out.println(1);
	    	else
		   	    System.out.println(0);
            t--;
        }
    }
}
// } Driver Code Ends
