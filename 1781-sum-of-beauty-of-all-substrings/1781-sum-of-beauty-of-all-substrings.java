class Solution {
    public int beautySum(String s) 
    {
       int freq[] = new int[26];
       int maxFreq = 0;
       int minFreq = 999;
       int sum = 0;

       for(int i = 0;i<s.length();i++)
       {
       
        Arrays.fill(freq,0);
          
         for(int j = i;j<s.length();j++)
         {
            char x = s.charAt(j);
             freq[x-'a']++;
             maxFreq = 0;
             minFreq = 999;
           
            for(int count : freq)
            {
                if(count>0){
                maxFreq = Math.max(maxFreq, count);
                minFreq = Math.min(minFreq, count);}
            }
            int  beauty = maxFreq-minFreq;
            sum+=beauty;
         }
       }   

       return sum;
    }
}