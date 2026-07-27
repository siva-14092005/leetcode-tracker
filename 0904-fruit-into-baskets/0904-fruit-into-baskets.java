class Solution {
    public int totalFruit(int[] fruits) 
    {
        // maximum length of the array with atmost 2 distinct elements 
        int n = fruits.length;
        int l = 0;
        int r = 0;
        int max_length  = 0;

        int count  = 0;

        Map<Integer,Integer> map = new HashMap<>();

        while(r<n)
        {
           int x = fruits[r];

           map.put(x,map.getOrDefault(x,0)+1);

           //invalid

           while(map.size() > 2)
           {
              int y = fruits[l];
              map.put(y,map.get(y)-1);
              l++;
              if(map.get(y) == 0) map.remove(y);
           }

           // valid 
           max_length = Math.max(max_length,r-l+1);
           r++;
        }  
        return max_length;  
    }
}