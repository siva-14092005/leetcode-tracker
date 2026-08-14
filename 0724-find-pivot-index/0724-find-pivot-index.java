class Solution {
    public int pivotIndex(int[] nums) 
    {
        int n = nums.length;
         int prefix[] = new int[nums.length];
         //int pre = nums[0];
         prefix[0] = nums[0];
         for(int i =1 ;i<nums.length;i++)
         {
            prefix[i] = prefix[i-1]+nums[i];
         }

         int suffix[] = new int[nums.length];
          suffix[n-1] = nums[n-1];

          for(int i= n-2;i>=0;i--)
          {
            suffix[i] = suffix[i+1]+nums[i];
          }

          for(int  i = 0;i<n;i++)
          if(suffix[i] == prefix[i]) return i;

        return -1;
    }
}