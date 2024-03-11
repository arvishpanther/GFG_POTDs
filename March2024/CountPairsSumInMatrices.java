class Solution {
    // int summer(int mat2[][],int x,int current1){
    //     int count=0;
    //     int sum1=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             if(mat2[i][j]+current==x){
    //                 count++;
    //             }//adhura........
    //         }
    //     }
    // }
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        Hashtable<Integer,Integer> hashT = new Hashtable<>();
        for(int[] row:mat1){
            for(int val: row){
                hashT.put(x-val,val);
            }
        }
        int count=0;
        int sum1=0;
        for(int[] row:mat2){
            for(int val: row){
                if(hashT.containsKey(val)){
                    count++;
                }
            }
        }
        return count;
    }
}
