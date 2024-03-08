// Expected Time Complexity: O(|s|) 
// Expected Auxiliary Space: O(1)

class Solution{
    boolean sameFreq(String s) {
        // code here
        HashMap<Character,Integer> mm = new HashMap<>();           //O(N) although it passed test cases
	    for(int i=0;i<s.length();i++){
	        mm.put(s.charAt(i),mm.getOrDefault(s.charAt(i),0)+1);
	    }
	    int mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE,mxCount=0,mnCount=0;
	    for(Map.Entry<Character,Integer> x : mm.entrySet()){
	        mn=Math.min(mn,x.getValue());
	        mx=Math.max(mx,x.getValue());
	    }
	    for(Map.Entry<Character,Integer> x : mm.entrySet()){
	        if(x.getValue()==mx)
	                mxCount++;
	        else if(x.getValue()==mn)
	                mnCount++;
	    }
	    if(mn==mx-1 && mxCount==1 || (mn==mx))
	        return true;
	    if(mnCount==1 && mn==1 && mxCount+mnCount==mm.size())
	        return true;
	    return false;
    }
}
/*
class Solution {
    boolean sameFreq(String s) {
        // code here
        int freq[] = new int[26];
        for(char c: s.toCharArray())
            freq[c - 'a']++;
        int count[] = new int[s.length() + 1];
        for(int i = 0 ; i < 26; i++) 
            count[freq[i]]++;
        int cnt = 0, operations = 0, firstNonZero = 0;
        boolean firstNonZeroFound = false;
        if(count[1] > 1){
            firstNonZero = 1;
            firstNonZeroFound = true;
        }
        for(int i = 2; i < count.length; i++){
            if(count[i] > 0 && !firstNonZeroFound){
                firstNonZero = i;
                firstNonZeroFound = true;
            }
            if(count[i] > 0)
                cnt++;
            if(firstNonZeroFound)
                operations += count[i] * (i - firstNonZero);
        }
        if(count[1] == 1){
            cnt--; operations++;
        }
        if(cnt > 2) return false;
        return operations <= 1;
    }
}
*/
