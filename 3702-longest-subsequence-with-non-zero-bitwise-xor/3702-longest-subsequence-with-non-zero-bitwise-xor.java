class Solution {
    public int longestSubsequence(int[] nums) 
    {
        int xor = 0;
        boolean flag = false;

        for(int num : nums)
        {
            xor ^= num;
            if(num>0) flag = true;
        }
       if(!flag) return 0; // all elements are zero 

       return xor != 0 ? nums.length : nums.length-1;

        

        
    }
}