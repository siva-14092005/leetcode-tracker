class Solution {
    public int[] searchRange(int[] nums, int target) 
    {
        List<Integer>list = new ArrayList<>();
        int l  = 0;
        int r  = nums.length-1;

        int index  = -1;

        while(l<=r)
        {
            int mid  = l+(r-l)/2;

            if(target <= nums[mid])
            {
                if(target == nums[mid])
                index = mid;
                r = mid-1;
            }
            else l = mid+1;
        }

        list.add(index);

        index = -1;
        l = 0;
        r = nums.length-1;

        while(l<=r)
        {
            int mid = l + (r - l)/2;

            if(target >= nums[mid])
            {
                if(target == nums[mid])
                index = mid;
                l  = mid+1;
            }
            else
            r  = mid-1;
        }

        list.add(index);
        
        int a[] = new int[2];

        for(int i = 0;i <list.size();i++)
        {
           a[i] = list.get(i);
        }

        return a;
        

    
        

        

    }
}