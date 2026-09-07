class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        double avg,max,sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
         max =sum/k;
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[l++];
            avg=sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}