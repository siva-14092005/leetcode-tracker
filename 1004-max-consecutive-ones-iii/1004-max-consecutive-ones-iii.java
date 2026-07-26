class Solution {
    public int longestOnes(int[] nums, int k) 
    {
       int l =0;
       int r = 0;
       int n = nums.length;
       int count  = 0;
       int max_len = 0;

       while(r<n)
       {
          if(nums[r] == 0)count++;
           
         // invalid
          while(count > k)
          {
            if(nums[l] == 0) count--;
            l++;
          }

          // valid 

          max_len =  Math.max(max_len,r-l+1);

          r++;
       }  

       return max_len;  
    }
}