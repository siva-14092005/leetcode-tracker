class Solution {
    public List<String> commonChars(String[] words) 
    {
        int global[] = new int[26];
        Arrays.fill(global,Integer.MAX_VALUE);

        int local[] =  new int[26];

        for(String a : words)
        {
            Arrays.fill(local,0);
            for(char b : a.toCharArray())
            {
                local[b-'a']++;
            }

            for(int i = 0;i<26;i++)
            global[i] = Math.min(global[i],local[i]);
        }

        List<String> ans = new ArrayList<>();

     for(int i = 0;i<26;i++)
     {
        while(global[i] > 0)
        {
            ans.add(String.valueOf((char) (i+'a')));
            global[i]--;
        }
     }
      return ans;

    }
}