class Solution {
    public int minimumPushes(String word) {

        int  push  = 1;
        int count  = 0;
        int total  = 0;

        int freq[] = new int[26];
       // Arrays.fill(freq,0);

        for(char x : word.toCharArray())
        {
            freq[x-'a']++;
        }
        
        Arrays.sort(freq);

         for (int i = 0; i < freq.length / 2; i++) {
            int temp = freq[i];
            freq[i] = freq[freq.length - 1 - i];
            freq[freq.length - 1 - i] = temp;
         }
         
         for(int a : freq)
         {
            if(count>7) push = 2;
            if(count>15) push = 3;
            if(count>23) push = 4;

            if(a!=0)
            {
                total += a*push;
                count++;
            }
            
           
         }

         return total;

         // its tto much compolex as i added another for loop to reverse 
         // but basically we can just traverse backwards right !!

    }
}