class Solution {
    public int romanToInt(String s) 
    {
         int sum = 0;
        Map<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('M',1000);
        map.put('D',500);

       for(int i = 0;i<s.length()-1;i++)
       {
          int x = map.get(s.charAt(i));
          int y = map.get(s.charAt(i+1));

          if(x<y) sum = sum-x;
          else sum = sum+x;
       }

       int last = map.get(s.charAt(s.length()-1));
       sum+=last;
       return sum;
    }
}