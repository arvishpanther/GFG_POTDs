/* Should return minimum distance between a and b
   in a tree with given root*/
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
//my Usercode
class GfG {
    void pathFinder(Node root,ArrayList curPath,ArrayList pathA,ArrayList pathB,int a,int b){
        if(root==null){
            return;
        }
        curPath.add(root.data);
        if(root.data==a){
            pathA.addAll(curPath);
        }
        if(root.data==b){
            pathB.addAll(curPath);
        }
        pathFinder(root.left,curPath,pathA,pathB,a,b);//for left child of node
        pathFinder(root.right,curPath,pathA,pathB,a,b);//for right ones
        curPath.remove(curPath.size()-1);
    }
    
    int findDist(Node root, int a, int b) {
        // Your code here
        ArrayList<Integer> curPath=new ArrayList<>();
        ArrayList<Integer> pathA=new ArrayList<>();
        ArrayList<Integer> pathB=new ArrayList<>();
        pathFinder(root,curPath,pathA,pathB,a,b);
        int i=0;
        int j=0;
        while(i<pathA.size()&&j<pathB.size()){
            if(pathA.get(i)!=pathB.get(j))
                break;
            i++;
            j++;
        }
        return pathA.size()-i+pathB.size()-j;
    }
}
//my code ends here......................................................

//{ Driver Code Starts
//NOde Structure
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Main {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
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
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            String[] ab = br.readLine().trim().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);

            GfG g = new GfG();
            System.out.println(g.findDist(root, a, b));
        }
    }
}
// } Driver Code Ends
//thanks for visit
