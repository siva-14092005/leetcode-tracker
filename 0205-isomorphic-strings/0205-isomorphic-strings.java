class Solution {
    public boolean isIsomorphic(String s, String t) 
    {
        int m = s.length();
        int n = t.length();
        if(n!=m) return false;

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        Arrays.fill(map1,-1);
        Arrays.fill(map2,-1);

        for(int i = 0;i<m;i++)
        {
            int x = s.charAt(i);
            int y = t.charAt(i);

            if(map1[x] == -1 && map2[y] == -1)
            {
                map1[x]= y;
                map2[y] = x;
            }
            else
            {
                if(map1[x]!=y || map2[y]!=x) return false;
            }

        } 

        return true;
    }
}