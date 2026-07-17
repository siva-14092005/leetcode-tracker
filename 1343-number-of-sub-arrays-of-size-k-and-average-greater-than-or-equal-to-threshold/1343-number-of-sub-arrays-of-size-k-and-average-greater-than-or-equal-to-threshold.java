class Solution {
    public int numOfSubarrays(int[] arr, int k, int limit) 
    {
       int n = arr.length;
       int l=0;
       int r=k-1;

       int count = 0;

       float sum  = 0;
       float avg = 0;

       for(int i = l;i<=r;i++)
       {
          sum+=arr[i];
       }

       avg = sum/k;
       if(avg >= limit) count++;

       while(r<n-1)
       {
         sum -= arr[l];
         l++;
         r++;
         sum += arr[r];

         avg = sum/k;
         if(avg>=limit) count++;
       }

        return count++;
           
    }
}