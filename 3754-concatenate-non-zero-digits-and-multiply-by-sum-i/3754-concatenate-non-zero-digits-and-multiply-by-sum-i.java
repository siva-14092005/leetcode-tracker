class Solution {
    public long sumAndMultiply(int n) 
    {
        if(n==0) return 0;
        long digit = n;
        long sum = 0;
        StringBuilder sb = new StringBuilder();
       while(n!=0)
       {
            long x = n%10;
            if(x!=0)
            {
                sum+=x;
                sb.append(x);
            }

            n=n/10;
       } 
       long ans  = Long.parseLong(sb.reverse().toString());

       return sum*ans;
    }
}