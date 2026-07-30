class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        //prefix sum,count
        Map<Integer,Integer>map = new HashMap<>();

        int count = 0;
        int current_sum = 0;
        map.put(0,1);

        for(int a : nums)
        {
            current_sum += a;
            count += (map.getOrDefault(current_sum-k,0));
            map.put(current_sum,map.getOrDefault(current_sum,0)+1);
        }
        return count;


    }
}