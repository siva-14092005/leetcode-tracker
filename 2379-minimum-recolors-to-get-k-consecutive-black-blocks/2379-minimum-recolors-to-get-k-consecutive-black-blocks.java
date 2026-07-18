class Solution {
    public int minimumRecolors(String blocks, int k) 
    {
       char[] c = blocks.toCharArray();

       int l = 0;
       int r = k-1;

       int n  = blocks.length();

       int w = 0;
       int b= 0;

       int sum = 0;
       int min_sum = Integer.MAX_VALUE;

       for(int i =l;i<=r;i++)
       {
          if(c[i] == 'W') w++;
          else b++;
       }  

       min_sum = Math.min((k-b),min_sum);

       while(r<n-1)
       {
          if(c[l] == 'W') w--;
          else b--;

          l++;

          r++;

          if(c[r] == 'W') w++;
          else b++;

          min_sum = Math.min((k-b),min_sum);

       }

       return min_sum;
    }
}