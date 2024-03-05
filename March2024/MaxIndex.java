static int maxIndexDiff(int a[], int n) { 
        // Your code here
        int right[] = new int[n];
        right[n-1]=a[n-1];
        for(int i=n-2;i>=0;i--){
          right[i]=Math.max(a[i],right[i+1]);
        }
        int i=0,j=0,ans=Integer.MIN_VALUE;
        while(i<n && j<n){
            if(a[i]<=right[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else i++;
        }
        return ans;
    }
