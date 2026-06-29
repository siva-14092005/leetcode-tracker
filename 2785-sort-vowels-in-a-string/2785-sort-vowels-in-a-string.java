class Solution {
    public String sortVowels(String s) 
    {
       List<Character> ans = new ArrayList<>();
       
       for(char c : s.toCharArray())
       {
         if(isVowel(c))
         {
            ans.add(c);
         }
       }

       Collections.sort(ans);
       
       StringBuilder sb = new StringBuilder();
       int index = 0;
       for(char c : s.toCharArray())
       {
          if(isVowel(c))
          {
            sb.append(ans.get(index++));
          }
          else
          {
            sb.append(c);
          }
       }
       
return sb.toString();
    }

    private boolean isVowel(char c)
    {
        return  ( c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
    }
    
    }
