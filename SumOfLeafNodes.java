class Solution
{   
    static void traverse(Node node,Node x){
        if(node==null){
            return ;
        }
        if(node.left==null && node.right==null){
            x.data+=node.data;
            return;
        }
        traverse(node.left,x);
        traverse(node.right,x);
    }
    public static int sumOfLeafNodes(Node root)
    {
        // code here 
        Node x=new Node(0);
        traverse(root,x);
        return x.data;
    }
}
