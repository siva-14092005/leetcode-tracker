class Solution {
    public int minFlips(String target) 
    {
        int state = 0;
        int count = 0;

        for(char a : target.toCharArray())
        {
            int x = Integer.parseInt(String.valueOf(a));
            if(state != x)
            {
                count++;
                state = 1-state;
            }
        } 

        return count;
    }
}