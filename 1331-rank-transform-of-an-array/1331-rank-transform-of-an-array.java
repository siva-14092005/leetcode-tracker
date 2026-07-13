class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        int n = arr.length;
        if(n==0) return  new int[0];

        int[] orginal = arr.clone();

        Arrays.sort(arr);
        int rank = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int a : arr)
        {
            if(!map.containsKey(a))
                map.put(a,rank++);
        }


        for(int i  = 0;i<n;i++)
        {
            arr[i] = map.get(orginal[i]);
        }
        return arr;

    }
}