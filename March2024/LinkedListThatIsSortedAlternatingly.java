
class Solution {
    
    public Node sort(Node head){
    //your code here, return the head of the sorted list
     if(head == null && head.next == null){
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while(current != null){
            list.add(current.data);
            current = current.next;
        }
        Collections.sort(list);
        
        current = head; 
        for(int i=0;i<list.size();i++){
            current.data = list.get(i);
            current = current.next;
        }
        return head;
   
   }
}
