/***Example 1>>>
n = 5
p[] = {40, 20, 30, 10, 30}
Output: 
True
Explaination: 
Let's divide this into matrix(only 4 are possible) 
[ [40, 20] -> A
, [20, 30] -> B
, [30, 10] ->C
, [10, 30] -> D ]
First we perform multiplication of B & C -> (BC)
then we multiply A to (BC) -> (A(BC))
then we multiply D to (A(BC)) -> ((A(BC))D)
so the solution returned the string ((A(BC))D), which performs minimum multiplications. The total number of multiplications are 20*30*10 + 40*20*10 + 40*10*30 = 26,000.

Example 2>>>
Input: 
n = 3
p = {3, 3, 3}
Output: 
True
Explaination: 
The solution returned the string (AB), which performs minimum multiplications. The total number of multiplications are (3*3*3) = 27.
*/
class Solution{
    static String matrixChainOrder(int p[], int n){
        // code here
        int dp[][] = new int[n][n];
        for(int temp[]:dp)Arrays.fill(temp,Integer.MAX_VALUE);
        int brackets[][] = new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<n-i+1;j++){
                for(int k=j;k<j+i-1;k++){
                    int total = dp[j][k]+dp[k+1][j+i-1]+p[j-1]*p[k]*p[j+i-1];
                    if(total<dp[j][j+i-1]){
                        dp[j][j+i-1]=total;
                        brackets[j][j+i-1]=k;
                    }
                }
            }
        }
        return help(1,n-1,brackets);
    }
    static String help(int i,int j,int brackets[][]){
        if(i==j){
            char a = (char)('A'+i-1);
            String temp = "";
            temp+=a;
            return temp;
        }
        return '('+help(i,brackets[i][j],brackets)+help(brackets[i][j]+1,j,brackets)+')';
    }
}
