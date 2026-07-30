class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        // first lets try to write sum at most k algorithm 
        return atmostK(nums,goal) - atmostK(nums,goal-1);
       
        
    }

    public int atmostK(int[] nums , int goal)
    {
        if(goal < 0) return 0; // this is for atmost(k-1) call if goal = 0 intially then goal - 1 becomes negative so !...
         int  l = 0;
        int  r = 0;
        int n = nums.length;
        int sum = 0;
        int count  = 0;

        while(r<n)
        {
            int x = nums[r];
            sum += x;

            while(sum > goal)
            {
                sum -= nums[l];
                l++;
            }

            count += r-l+1;
            r++;
        }

        return count;
    }
}