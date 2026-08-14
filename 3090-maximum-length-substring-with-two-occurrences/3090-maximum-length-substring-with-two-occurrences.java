class Solution {
    public int maximumLengthSubstring(String s) 
    {
        int  l = 0;
        int r= 0;
        int len = 0;
        int n = s.length();

        char hello[] =s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();


        while(r<n)
        {
           char x = hello[r];
           map.put(x,map.getOrDefault(x,0)+1);

           while(map.get(x)>2)
           {
              char y = hello[l];
              map.put(y,map.get(y)-1);
              if(map.get(y) == 0) map.remove(y);
              l++;
           }

           len = Math.max(len,r-l+1);
            r++;
        }

        return len;
       


    }
}