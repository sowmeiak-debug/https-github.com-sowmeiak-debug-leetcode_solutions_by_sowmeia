class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
             sum+=nums[i];
             pre[i]=sum;
        }
        return pre;
    }
}