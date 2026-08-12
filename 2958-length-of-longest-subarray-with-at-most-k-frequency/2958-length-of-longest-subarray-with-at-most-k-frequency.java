class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    { 
         int  l = 0;
         int r =0 ;
         int len = 0;
         
         Map<Integer,Integer> map = new HashMap<>();

         while(r<nums.length)
         {
             int x = nums[r];
             map.put(x,map.getOrDefault(x,0)+1);

             while(map.get(x) > k)
             {
                int y = nums[l];
                map.put(y,map.get(y)-1);
                l++;
             }

             len = Math.max(len,r-l+1);
             r++;
         } 

         return len;
    }
}