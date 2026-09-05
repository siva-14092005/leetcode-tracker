class Solution {
    public int minimumDeletions(int[] nums) 
    {
        int n  =nums.length;
        int min  = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int mindex  = 0;
        int maxdex  = 0;

        for(int i = 0 ;i  <nums.length;i++)
        {
            int a = nums[i];
            if(a>max){ max = a; maxdex = i;}
            if(a<min){ min = a; mindex = i;}
        }

        int i  = Math.min(mindex,maxdex);
        int j = Math.max(maxdex,mindex);

        //delete both from front
        int m1  = j+1;
        //delete both from back 
        int m2 =  n-i;
        //delete i from front and j from back 
        int m3  = (i+1) + (n-j);

        return Math.min(m1,Math.min(m2,m3));


        
        
        
    }

   

    }
