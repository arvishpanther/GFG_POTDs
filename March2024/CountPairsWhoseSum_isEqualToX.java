class Solution {
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, Integer x) {
        // add your code here
        Set<Integer> set=new HashSet<>();
        for(Integer i:head1){
            set.add(x-i);
            // head1=head1.next;
        }
        int count=0;
        for(Integer i:head2){
            if(set.contains(i)){
                count++;
            }
        }
        return count;
    }
}
