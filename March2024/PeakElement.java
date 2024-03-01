class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] a,int n)
    {
        if(n==1){
            return 0;
        }
        if(a[n-2]<=a[n-1]){
           x=n-1;
        }
        if(a[n-2]<=a[n-1]){
           x=n-1;
        }
        if(a[0]>a[1]){
           return 0;
        }
        //add code here.
        int x=-1;
        for(int i=1;i<n-1;i++){
           if(a[i]>=a[i-1] && a[i]>=a[i+1]){
               x=i;
           }
        }
        return x;
    }
}
