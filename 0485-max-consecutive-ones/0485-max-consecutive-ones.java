class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int count = 0;
        int max_count = 0;

        for(int a : nums)
        {
            if(a==1)
            {
                count++;
                max_count = Math.max(count,max_count);
            }
            else 
            {
                count = 0;
            }
        } 
        return max_count;   
    }
}