 static int help(String A,String B,String C,int i,int j,int k,int n1,int n2,int n3,int dp[][][]){
            if(i==n1 || j==n2 || k==n3)return 0;
            if(dp[i][j][k]!=-1)return dp[i][j][k];
            if(A.charAt(i)==B.charAt(j) && A.charAt(i)==C.charAt(k)){
                return dp[i][j][k]=1+help(A,B,C,i+1,j+1,k+1,n1,n2,n3,dp);
            };
            int a = help(A,B,C,i+1,j,k,n1,n2,n3,dp);
            int b = help(A,B,C,i,j+1,k,n1,n2,n3,dp);
            int c = help(A,B,C,i,j,k+1,n1,n2,n3,dp);
            return dp[i][j][k]= Math.max(a,Math.max(b,c));
    }
    int LCSof3(String A, String B, String C, int n1, int n2, int n3) 
    { 
        // code here
        int dp[][][] = new int[n1][n2][n3];
        for(int temp[][]:dp){
            for(int temp2[]:temp){
                Arrays.fill(temp2,-1);
            }
        }
        return help(A,B,C,0,0,0,n1,n2,n3,dp);
    }
