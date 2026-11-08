class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int l=(nums.length-1)/2;
        int count=0;
        for(int i=0;i<nums.length;i++){
            int sum=nums[l]^nums[i];
            if(sum==0)
            count++;
        }
        if(count==1)
        return true;
        else
        return false;
    }
}