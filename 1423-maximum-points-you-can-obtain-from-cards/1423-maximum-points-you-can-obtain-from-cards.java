class Solution {
    public int maxScore(int[] a, int k) {
        
       int ls = 0,rs=0,max_sum=0;

       for(int i = 0;i<k;i++)
       {
         ls += a[i];
       }

       max_sum = ls;

       int r = a.length-1;

       for(int i = k-1;i>=0;i--)
       {
           ls = ls - a[i];
           rs = rs + a[r];
           r--;
           max_sum = Math.max(max_sum,ls+rs);
       }

       return max_sum;
    }
}