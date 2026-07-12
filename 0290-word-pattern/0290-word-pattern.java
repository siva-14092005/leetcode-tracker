class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        String ans[] = s.split(" ");
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> map1 = new HashMap<>();

        char[]  p  = pattern.toCharArray();
        
        boolean flag = true;
        boolean flag1 = true;

        if(p.length != ans.length) return false;
        for(int i = 0;i<p.length;i++)
        {
            if(map.containsKey(p[i]))
            {
                String a = map.get(p[i]);
                if(!a.equals(ans[i])) flag =  false;
            }
            else
            {
                map.put(p[i],ans[i]);
            }
        }
        
        if(flag == false) return false;

        for(int i = 0;i<p.length;i++)
        {
            if(map1.containsKey(ans[i]))
            {
                char x = map1.get(ans[i]);
                if( x != p[i]) flag1 = false;
            }
            else 
            map1.put(ans[i],p[i]);
        }
         



        return flag&&flag1;

    }
}