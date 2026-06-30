class Solution {
    public String shiftingLetters(String s, int[][] shifts) 
    {
       int[] diff = new int[s.length()];

       for(int i = 0;i<shifts.length;i++)
       {
          int left = shifts[i][0];
          int right =  shifts[i][1];
          int dir = shifts[i][2];

          if(dir == 0)
          {
            diff[left]+=(-1);
            if(right+1<s.length())
            diff[right+1]-=(-1);
          }
          else
          {
            diff[left]+=1;
            if(right+1<s.length())
            diff[right+1]-=1;

          }
       } 

       for(int i=1;i<s.length();i++)
       diff[i] = diff[i]+diff[i-1];

       char[] hello = s.toCharArray();

       for(int i= 0;i<hello.length;i++)
       {
           int netshift = diff[i] % 26;
           
           int oldpos = hello[i]-'a';

           int newpos = (oldpos +netshift+26)%26;

           hello[i]= (char)('a'+newpos);
       }

       return new String(hello);
    }
}