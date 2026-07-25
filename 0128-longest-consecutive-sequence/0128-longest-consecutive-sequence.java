class Solution {
    public int longestConsecutive(int[] nums) 
    { 
        /*
           Arrays.sort(nums);

           int count  = 1;
           int max_count  = 1;
           if(nums.length == 0) return 0;
           if(nums.length == 1) return 1;

           for(int i = 0;i<nums.length-1;i++)
           {
            if( nums[i] == nums[i+1]) continue;
            if(nums[i+1] == nums[i]+1)
            {
                count++;
                max_count = Math.max(max_count,count);
            }
            else count  = 1;
           }

           return max_count;*/

            if(nums.length == 0) return 0;
           if(nums.length == 1) return 1;

           Set<Integer> set = new HashSet<>();

           for(int i = 0;i<nums.length;i++)
           {
            set.add(nums[i]);
           }

           int count  =1 ;
           int max_count  = 1;

           for(int a : set)
           {
              if(!set.contains(a-1))
              {
                 int x = a;
                 while(set.contains(x+1))
                 {
                    count++;
                    x++;
                 }
                 max_count = Math.max(count,max_count);
              }
              count = 1;
           }

           return max_count;
    }
}