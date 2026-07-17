class Solution {
    public int numOfSubarrays(int[] arr, int k, int limit) 
    {
        // average >= limit  ->   sum/k  >= limit  ->  sum >= limit*k;
       
       int n = arr.length;
       int l=0;
       int r=k-1;

       int count = 0;

       int sum  = 0;
       
       int target_sum = limit*k; // look formula above 

       for(int i = l;i<=r;i++)
       {
          sum+=arr[i];
       }

       if(sum>=target_sum) count++;

       

       while(r<n-1)
       {
         sum -= arr[l];
         l++;
         r++;
         sum += arr[r];
         if(sum>=target_sum) count++;  
       }

        return count;
           
    }
}