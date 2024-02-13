class Solution{
    static void dfs(Node ans,Node node,HashMap<Integer,Node> vis){
        vis.put(ans.val,ans);
        for(Node x:node.neighbors){
            if(vis.get(x.val)==null){
                Node newNode = new Node(x.val);
                ans.neighbors.add(newNode);
                dfs(newNode,x,vis);
            }
            else{
                ans.neighbors.add(vis.get(x.val));
            }
        }
    }
    Node cloneGraph(Node node){
        Node ans = new Node(node.val);
        HashMap<Integer,Node> vis = new HashMap<>();
        dfs(ans,node,vis);
        return ans;
    }
}
