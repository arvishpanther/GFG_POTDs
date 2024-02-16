import java.util.*;
import java.lang.*;
import java.io.*;
//User function Template for Java
class Solution
{
    public int isPossible(int[][] paths)
    {
        // Code here
        for(int i=0;i<paths.length;i++){
	        int c=0;
	        for(int j=0;j<paths.length;j++){
	            if(paths[i][j]==1)c++;
	        }
	        if(c%2==1)return 0; 
	    }
	    return 1;
    }
}

//{ Driver Code Starts
//Initial Template for Java
class GFG
{
    public static void main(String[] args) throws IOException
    {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Scanner sc=new Scanner(System.in);
        // int T = Integer.parseInt(br.readLine().trim());
      int T=sc.nextInt();
        while(T-->0)
        {
            // int n = Integer.parseInt(br.readLine().trim());
          int n=sc.nextInt();
            int[][] paths = new int[n][n];
            for(int i = 0; i < n; i++){
                // String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    // paths[i][j] = Integer.parseInt(s[j]);
                  paths[i][j]=sc.nextInt();
                }
            }
            Solution obj = new Solution();
            int ans = obj.isPossible(paths);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends
