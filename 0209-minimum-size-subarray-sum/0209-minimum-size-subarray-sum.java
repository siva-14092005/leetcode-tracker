class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        /*  brute force ----
       boolean flag = true;
       int sum = 0;
       int minlen =Integer.MAX_VALUE;
       for(int i = 0 ;i < nums.length;i++)
       {
          sum  = 0;

          for(int j = i;j<nums.length;j++)
          {
            sum +=nums[j];
            if(sum>=target)
            {
                minlen = Math.min(minlen,j-i+1);
                flag = false;
            }
          }
       }

       if(!flag)   return minlen;
       return 0;*/

       // optimal 

        boolean flag = true;
       int r=0,l=0,sum=0,minlen = Integer.MAX_VALUE;
       
       int k = target;

       while(r<nums.length)
       {
         sum = sum + nums[r];
         
         while(sum >=k)
         {
            minlen = Math.min(minlen,r-l+1);
            sum -= nums[l];
            l++;
            flag = false;    
         }
        

         r++;
       }

       if(!flag) return minlen;
       return 0;
    }
}