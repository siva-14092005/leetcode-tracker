class Solution {
    public int findPairs(int[] nums, int k) 
    {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
           for(int i : nums)
           {
             map.put(i,map.getOrDefault(i,0)+1);
           }

          if(k == 0)
          {
             for(int  i : map.keySet())
             {
                if(map.get(i)>1)
                count++;
             }
          }
          else
          {
             for(int  i : map.keySet())
             {
               if(map.containsKey(i-k))
               count++;
             }
          }

          return count;
    }
}