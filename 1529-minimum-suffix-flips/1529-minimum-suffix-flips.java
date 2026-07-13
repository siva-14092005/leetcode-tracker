class Solution {
    public int minFlips(String target) 
    {
        char  state = '0';
        int count = 0;

        for(char a : target.toCharArray())
        {
            
            if(state != a)
            {
                count++;
                if(state == '0') state = '1';
                else state = '0';
            }
        } 

        return count;
    }
}