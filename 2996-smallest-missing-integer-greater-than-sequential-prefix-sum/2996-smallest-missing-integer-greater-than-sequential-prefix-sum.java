class Solution {
    public int missingInteger(int[] nums) 
    {
        int sum = 0;
        int i = 0;

        while( i+1
        <nums.length && nums[i]+1 == nums[i+1] )
        {
            sum+=nums[i];
            i++;
        }
        if(i<nums.length) sum+=nums[i];

        Set<Integer> set = new HashSet<>();
        for(int a : nums)set.add(a);

        while(set.contains(sum))
        {
            sum++;
        }
        return sum;


    }
}