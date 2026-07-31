class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        return helper(nums,k) - helper(nums,k-1);
    }

    public int helper(int nums[] , int k)
    {
        if(k<0) return 0;
         int l = 0;
         int r  = 0;
         Map<Integer,Integer> map = new HashMap<>();
         int count  = 0;

         int n = nums.length;

         while(r<n)
         {
            
            int x = nums[r];
            map.put(x,map.getOrDefault(x,0)+1);

            while(map.size()>k)
            {
                int y = nums[l];
                map.put(y,map.get(y)-1);
                if(map.get(y)==0) map.remove(y);
                l++;
            }

            //valid

            count+= r-l+1;
            r++;
         }

         return count;
    }
}