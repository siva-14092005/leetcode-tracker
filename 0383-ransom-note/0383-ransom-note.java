class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
       int[] ans = new int[26];
       for(char c : ransomNote.toCharArray())
       ans[c-'a']++;

       for(char c : magazine.toCharArray())
       {
        ans[c-'a']--;
       }

       for(int a : ans) if (a> 0) return false;
       return true;

    }
}