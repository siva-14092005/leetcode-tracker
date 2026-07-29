class Solution {
    public int characterReplacement(String s, int k) 
    {
        Map<Character,Integer> map = new HashMap<>();
        int l = 0;
        int r  = 0;
        int n = s.length();
        char[] nums = s.toCharArray();
       int  max_freq = Integer.MIN_VALUE;
       int max_length  = 0;
        

        while(r<n)
        {
              char x = nums[r];
              map.put(x,map.getOrDefault(x,0)+1);

              max_freq = Math.max(max_freq,map.get(x));

              //invalid

              if((r-l+1) - max_freq > k)
              {
                char y = nums[l];
                map.put(y,map.get(y)-1);
                if(map.get(y) == 0)
                map.remove(y);
                l++;
              }


              max_length = Math.max(max_length,r-l+1);
              r++;   
        }

        return max_length;
    }
}