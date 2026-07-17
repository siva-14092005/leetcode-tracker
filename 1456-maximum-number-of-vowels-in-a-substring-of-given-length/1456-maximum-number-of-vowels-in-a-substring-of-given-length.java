class Solution {
    public int maxVowels(String ss, int k) 
    {
        int n = ss.length();
        char[] s = ss.toCharArray();
        int l = 0;
        int r  = k-1;

        int max_count = 0;
        int count = 0;

        for(int i = 0;i<=r;i++)
        
        if(isvowel(s[i])) count++;

        max_count = count;

        while(r<n-1)
        {
            if(isvowel(s[l])) count--;
            l++;
            r++;
            if(isvowel(s[r])) count++;
          max_count = Math.max(max_count,count);
        }

        return max_count;
    }

    private boolean isvowel(char c)
    {
        if( c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
}