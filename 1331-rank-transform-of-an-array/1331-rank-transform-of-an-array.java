class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        int n = arr.length;
        if(n==0) return  new int[0];
        int[] orginal = arr.clone();

        Arrays.sort(arr);
        int rank = 1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n-1;i++)
        {
           if(arr[i]!=arr[i+1]) map.put(arr[i],rank++);
           else
           map.put(arr[i],rank);
        }
        map.put(arr[n-1],rank);

        for(int i  = 0;i<n;i++)
        {
            arr[i] = map.get(orginal[i]);
        }
        return arr;

    }
}