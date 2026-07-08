class Solution {
    public long sumAndMultiply(int n) 
    {
        if(n==0) return 0;
        
        long sum = 0;
        long reversed = 0;
        long placevalue = 1;
        
       while(n!=0)
       {
            long x = n%10;
            if(x!=0)
            {
                sum+=x;
                
                reversed =(reversed)+(x*placevalue); // to append only non zero numbers 
                placevalue*=10;

            }

            n=n/10;
       } 
      

       return sum*reversed;
    }
}