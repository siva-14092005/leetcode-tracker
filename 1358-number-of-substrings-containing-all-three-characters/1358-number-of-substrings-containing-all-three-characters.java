class Solution {
    public int numberOfSubstrings(String s) 
    {
        int al=-1,bl=-1,cl=-1;
        char[] ans = s.toCharArray();
        int count = 0;
        for(int i = 0;i<s.length();i++)
        {
           if(ans[i] == 'a') al = i;
           else if(ans[i] == 'b') bl = i;
           else if(ans[i] == 'c') cl = i;

           if(al!=-1 && bl != -1 && cl != -1)
           {
              int dummy = Math.min(al,Math.min(bl,cl));
              dummy++;
              count += dummy;
           }
        }

        return count;
    }
}