/*  Input: Binary tree
          35
        /    \
     20        15
    /  \      /  \
   15   5   10    5
Output: 1
*/
class Solution{
    public static int isSumProperty(Node root) {

        if (root == null)
            return 1;

        if (root.left == null && root.right == null)
            return 1;

        int sum = 0;

        if (root.left != null)
            sum += root.left.data;
        if (root.right != null)
            sum += root.right.data;

        if(sum == root.data){
            if(isSumProperty(root.left) == 1 && isSumProperty(root.right) == 1){ 
                return 1;
            }
        }
        return 0;
        
    }
}
