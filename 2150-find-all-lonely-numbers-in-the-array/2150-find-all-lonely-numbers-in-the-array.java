class Solution {
    public List<Integer> findLonely(int[] nums) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list =  new ArrayList<>();

        for(int a  : nums) map.put(a,map.getOrDefault(a,0)+1);

        for(int a : nums)
        {
            if(map.get(a) == 1)
            {
                if(!map.containsKey(a-1)&&!map.containsKey(a+1)) list.add(a);
            }
        }
        return list;
    }
}