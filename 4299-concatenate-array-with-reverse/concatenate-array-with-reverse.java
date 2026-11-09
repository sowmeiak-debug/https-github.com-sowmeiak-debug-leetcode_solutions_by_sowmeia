class Solution {
    public int[] concatWithReverse(int[] nums) {
        int arr[]=new int[nums.length*2];
        int k=0,n=nums.length;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+n]=nums[n-i-1];
        }
        return arr;
    }
}