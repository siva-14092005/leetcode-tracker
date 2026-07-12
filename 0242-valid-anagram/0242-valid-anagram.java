class Solution {
    public boolean isAnagram(String s, String t) 
    {
       int[] ans = new int[26];

       int n = s.length();
       int m = t.length();

       if(n!=m) return false;

       for(int i = 0;i<n;i++)
       {
          char x = s.charAt(i);
          char y = t.charAt(i);

          ans[x-'a']++;
          ans[y-'a']--;
       }   

       for(int a : ans)
       if(a!=0) return false;

       return true; 
    }
}