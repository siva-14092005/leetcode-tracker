class Solution {
    public String frequencySort(String s) 
    {
            Map<Character,Integer> map = new HashMap<>();
// gettimg freqency 
            for(char c : s.toCharArray())

                map.put(c,map.getOrDefault(c,0)+1);
// populating buckets
            List<Character> bucket[] = new List[s.length()+1];

            for(char key : map.keySet())
            {
                int freq = map.get(key);
                
                if(bucket[freq]==null)
                {
                    bucket[freq] =  new ArrayList<>();
                }
                bucket[freq].add(key);
            }
// building string 
            StringBuilder sb = new StringBuilder();

            for(int i = bucket.length-1;i>=0;i--)
            {
                if(bucket[i]!=null)
                {
                    for(char c :bucket[i])
                    {
                        for(int j=0;j<i;j++)
                        sb.append(c);
                    }
                }
            }
return sb.toString();
            
            
    }
}