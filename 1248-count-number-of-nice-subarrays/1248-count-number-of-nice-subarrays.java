class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {
        return helper(nums,k)-helper(nums,k-1);
    }

    public int helper(int[] nums,int k)
    {
         int l = 0;
         int r  = 0;
         int n = nums.length;

         int count = 0;
         int odd_count = 0;

         while(r<n)
         {
            int x  = nums[r];
            if(x%2!=0) odd_count++;

            while(odd_count > k)
            {
                int y = nums[l];
                if(y%2!=0) odd_count--;
                l++;
            }

            count += r-l+1;
            r++;

         }   

         return count;
    }
}