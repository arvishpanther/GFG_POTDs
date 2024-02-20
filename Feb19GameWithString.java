class Solution{
    static int minValue(String s, int k){
        // code here
        // HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int mm[] = new int[26];
        Arrays.fill(mm,0);
        for(int i=0;i<s.length();i++){
            mm[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(mm[i]!=0)pq.add(mm[i]);
        }
        while(k!=0){
            int temp = pq.remove();
            temp--;
            pq.add(temp);
            k--;
        }
        int ans = 0;
        while(pq.size()!=0){
            int temp = pq.remove();
            ans+=temp*temp;
        }
        return ans;
    }
}
