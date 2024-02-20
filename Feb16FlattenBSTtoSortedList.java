class Solution {
    Node prev=null,ans=null;
    void help(Node node){
        if(node==null){
            return;
        }
        help(node.left);
        if(prev!=null){
            prev.right=node;
            prev.left=null;
        }
        else
            ans=node;
        prev=node;
        help(node.right);
        prev.left=null;
    }
    public Node flattenBST(Node root) {
        // Code here
        ans=null;
        prev=null;
        help(root);
        return ans;
    }
}
