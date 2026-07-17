class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        // constant fix window 

        int  l = 0;
        int r  = k-1;
        int  sum = 0;
    
        for(int i = 0;i<=r;i++)
        sum += nums[i];

        int  max_ans = sum;

        while(r<nums.length-1)
        {
            sum -= nums[l];
            l++;
            r++;
            sum += nums[r];
            max_ans = Math.max(max_ans,sum);
        }  

        return (double)max_ans/k;
    }
}