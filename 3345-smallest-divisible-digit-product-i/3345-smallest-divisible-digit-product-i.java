class Solution {
    public int smallestNumber(int n, int t) 
    {
        int product = 1;
        int orginal = n;    
        while(true)
        {
            orginal = n;
            product = 1;
            while(n!=0)
            {
               int x =  n%10;
               product*=x;
               n=n/10;
            }
            if(product % t == 0) return orginal;
            n = orginal+1;
        }
        //return 0;
    }
}