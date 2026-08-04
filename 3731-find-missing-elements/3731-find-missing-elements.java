class Solution {
    public List<Integer> findMissingElements(int[] nums) 
    {
        int small = 999;
        int large  = 0;
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int a  : nums )
        {
            if(a<small) small =a;
            if(a>large) large = a;
            set.add(a);
        }

        for(int i =small ;i <=large;i++)
        {
            if(!set.contains(i)) list.add(i);
        }

        return list;

        
   
    }
}