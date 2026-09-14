class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        Arrays.sort(nums);
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target)
            left=mid+1;
            else if(nums[mid]>target)
            right=mid-1;
             if(nums[mid]==target)
            return true;
        }
        return false;
    }
}