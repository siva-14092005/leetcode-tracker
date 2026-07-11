class Solution {
    public int myAtoi(String s) 
    {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int flag = 0;
        boolean signseen = false;


        while(i<s.length())
        {
           char x = s.charAt(i);
           if( x == '+' && sb.length() == 0 && signseen != true) 
           {
            i++;
            signseen = true;
           }

           else if(x=='-' && sb.length()==0 && signseen!=true)
           { 
            flag = 1;
            i++;
            signseen = true;
           }
           else if( x == ' ' && sb.length() == 0 && signseen != true) i++;
           else if(Character.isDigit(x))
           {
             sb.append(x);
             i++;
           }

           else break;
        }

        String ans = sb.toString();
        if(ans.length() == 0) return 0;
        double ans1 = Double.parseDouble(ans);

        if (flag == 1) {
    
    if (ans1 >= Math.abs((double) Integer.MIN_VALUE)) {
        return Integer.MIN_VALUE;
    }
    return -1 * (int) ans1;
} else {
    
    if (ans1 >= Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
    }
    return (int) ans1;
}
    }
}