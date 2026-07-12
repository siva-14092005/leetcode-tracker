class Solution {
    public boolean isAlienSorted(String[] words, String order) 
    {
        int rank  = 0;
        int boo = 0;
        Map<Character,Integer> map = new HashMap<>();   
        for(char c :order.toCharArray())
        {
            map.put(c,rank);
            rank++;
        }

        for(int j = 0;j<words.length-1;j++)
        {
            boo = 0;
            String word1 = words[j];
            String word2 = words[j+1];

            int r = Math.min(word1.length(),word2.length());

            for(int i = 0;i<r;i++)
            {
                
                char x = word1.charAt(i);
                char y = word2.charAt(i);

                if(map.get(x) < map.get(y))
                {
                    boo = 1;


                    break; 
                    
                }
                if(map.get(x) > map.get(y)) return false;
            }
           if((boo == 0) && (word1.length()> word2.length())) return false;
        }

        return true;
    }
}