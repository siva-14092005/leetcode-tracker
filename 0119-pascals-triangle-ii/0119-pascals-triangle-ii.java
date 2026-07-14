class Solution {
    public List<Integer> getRow(int row) 
    {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        long  ans = 1;
        
        for(int i = 1;i<=row;i++)
        {
            // row-col+1/col
             
              ans = ans * (row-i+1)/i;
             list.add((int)ans);

        }    

        return list;
    }
}