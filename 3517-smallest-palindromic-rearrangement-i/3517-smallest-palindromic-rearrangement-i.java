class Solution {
    public String smallestPalindrome(String s) 
    {
      int n = s.length();
      String middle ="";
      if(n%2!=0) middle = Character.toString(s.charAt(n/2));
      String s1 = s.substring(0,n/2);
      char a[] = s1.toCharArray();
      Arrays.sort(a);
      String ans1 = new String(a);

      StringBuilder sb = new StringBuilder(ans1);
      
      String s2 = sb.reverse().toString();

      return ans1+middle+s2;


    }
}