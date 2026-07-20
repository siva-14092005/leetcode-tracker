class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        if(s.length() == 0) return 0;
         char[] c = s.toCharArray();

         HashSet<Character> set = new HashSet<>();

         int l = 0 , r = 0,max_len = Integer.MIN_VALUE;

         while( r < c.length)
         {
            
            // invalid
           while(set.contains(c[r]))
           {
                set.remove(c[l]);
                l++; 
           }

            //valid 
            set.add(c[r]);
            max_len  = Math.max(max_len,r-l+1);
            r++;
         }

         return max_len;

         
    }
}