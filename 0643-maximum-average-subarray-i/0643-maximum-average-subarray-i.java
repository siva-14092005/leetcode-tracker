class Solution {
    public double findMaxAverage(int[] nums, int k) 
    {
        int  l = 0;
        int r  = k-1;
        double sum = 0;
        double avg = 0;
        double max_ans = 0;
       

        for(int i = 0;i<=r;i++)
        sum += nums[i];

        max_ans  = sum/k;

        while(r<nums.length-1)
        {
            sum -= nums[l];
            l++;
            r++;
            sum += nums[r];
            avg = sum/k;

            max_ans = Math.max(max_ans,avg);
        }  

        return max_ans;
    }
}