class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0,r=arr.length-1;
        while(i<=r){
            int mid=i+(r-i)/2;
            if(arr[mid]>arr[mid+1])
            r=mid-1;
            else if (arr[mid]<arr[mid+1])
            i=mid+1;
        }
        return i;
    }
}