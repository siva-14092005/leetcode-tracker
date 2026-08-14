class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr1)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int index = 0;

        for(int i : arr2)
        {

            while(map.get(i)>0)
            {
                arr1[index] = i;
                index++;
                map.put(i,map.get(i)-1);

            }
            map.remove(i);
        }

        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> e : map.entrySet())
        {
            int num = e.getKey();
            int freq = e.getValue();

            while(freq>0)
            {
                list.add(num);
                freq--;
            }
        }

        Collections.sort(list);

        for(int a : list)
        {
            arr1[index] =a;
            index++;
        }

        return arr1;
    }
}