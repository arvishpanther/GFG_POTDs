//Expected Time Complexity: O(n3).
// Expected Auxiliary Space: O(n).
public boolean isAdditiveSequence(String n) {
        // code here
        int first = 0;
        int len= n.length();
        for(int i = 0 ; i < len- 2 ; i++){
            first = (first*10)+(int)(n.charAt(i) - '0');
            int second = 0;
            for(int j=i+1;j<len-1;j++){
                second = (second*10) + (int)(n.charAt(j) - '0');
                int n1 = first , n2 = second;
                int third = 0 , k = 0;
                for(k = j + 1 ; k < len; k++){
                    third = (third*10) + (int)(n.charAt(k) - '0');
                    if(third == (n1 + n2)){
                        n1 = n2;
                        n2 = third;
                        third = 0;
                    }
                }
                if(k == len && third == 0){
                    return true;
                }
            }
        }
        return false;
    }
