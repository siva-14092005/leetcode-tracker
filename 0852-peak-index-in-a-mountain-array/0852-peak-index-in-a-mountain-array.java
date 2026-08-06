class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
        /*
        int i = 0;
        int n = arr.length;

        while(i<n && arr[i]<arr[i+1])
        {
            i++;
        } 
        return i;
        */

        int high = arr.length-1;
        int low = 0;

        while(low < high)
        {
            int mid =low+(high-low)/2;
            if(arr[mid] < arr[mid+1])
            low = mid+1;
            else
            high = mid;
        }
        return low;
    }
}