class Solution {
    public int numberOfSubstrings(String s) 
    {
        char nums[] = s.toCharArray();
        
       int count = 0;

       int  l = 0;
       int  r = 0 ;
       int n = s.length();

       Map<Character,Integer> map = new HashMap<>();

       while(r<n)
       {
          char x = nums[r];
          map.put(x,map.getOrDefault(x,0)+1);

          while(map.size() == 3) 
          {
            count += n-r;

            // Shrink window from left
                char leftChar = s.charAt(l);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
          }
          r++;
          
       }


        
        return count;
        
    }
}