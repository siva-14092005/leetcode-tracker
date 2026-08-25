class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
       Set<Integer>set = new HashSet<>();
       int n = nums.length;
       

       for(int i : nums) 
       {
         set.add(i);

       }

        int i = 0;
        for( i = 1;i<=n;i++) 
       {
         if(!set.contains(k*i))
         return k*i;

       }
         return k*(i);
       
    }
}