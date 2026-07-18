class Solution {
    public int findGCD(int[] nums) 
    {
     
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;

      for(int num : nums)
      {

        if(num>max) max = num;
        if(num<min) min = num;
      }
      
      return gcd(max,min);

    }
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a % b;
            a = temp; 
        }
        return a;
    }
}