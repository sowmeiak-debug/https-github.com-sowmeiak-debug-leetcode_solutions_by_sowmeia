class Solution {
    public int[] sortArrayByParity(int[] arr) {
       int l=arr.length-1;
       int i=0;
       while(i<l){
        if(arr[i]%2==0)
        i++;
        if(arr[l]%2!=0)
        l--;
        else{
            int tem=arr[i];
            arr[i]=arr[l];
            arr[l]=tem;
        }
       }
       return arr;
    }
}