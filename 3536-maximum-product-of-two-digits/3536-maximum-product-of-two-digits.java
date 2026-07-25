class Solution {
    public int maxProduct(int n) 
    {
        int orginal= n;
        int size = 0;

        while(n>0)
        {
            size++;
            n=n/10;
        }   

        int a[] = new int[size];

        int i  = 0 ;
        while(orginal > 0)
        {
            int x = orginal % 10;
            a[i] = x;
            i++;
            orginal = orginal / 10;
        }

        Arrays.sort(a);
        return a[size-2] * a[size-1];

    }
}