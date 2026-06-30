class Solution {
    public boolean carPooling(int[][] trips, int capacity) 
    {
       int[] km = new int[1001];
       for(int i = 0;i<trips.length;i++)
       {
         int left = trips[i][1];
         int right = trips[i][2];
         int total = trips[i][0];

         km[left]+=total;
         
         km[right]-=total;
       } 
       
       if(km[0]>capacity) return false;
       for(int i = 1;i<km.length;i++)
       {
         km[i] = km[i]+km[i-1];
         if(km[i]>capacity) return false;
       }
       return true;
    }
}