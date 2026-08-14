class Solution {
    public int strStr(String haystack, String needle) 
    {/*
        int n = haystack.length();
        int m = needle.length();


        int i = 0;

        while(i+m<=n)
        {
            String s = haystack.substring(i,i+m);
            if(s.equals(needle)) return i;
            i+=1;
        }
        return -1;*/

        return (haystack.indexOf(needle));
    }
}