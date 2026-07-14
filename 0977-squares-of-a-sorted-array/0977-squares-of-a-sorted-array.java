class Solution {
    public int[] sortedSquares(int[] nums) 
    {
      int[] ans = new int[nums.length];
      int temp = nums.length-1;
      int i = 0;
      int j = nums.length-1;

      while(i<=j)
      {
         int x = nums[i]*nums[i];
         int y = nums[j]*nums[j];

         if(x>y)
         {
           ans[temp] = x;
           i++;
           temp--;
         }
         else
         {
             ans[temp] = y;
             j--;
             temp--;
         }
      }

      return ans;
    }
}