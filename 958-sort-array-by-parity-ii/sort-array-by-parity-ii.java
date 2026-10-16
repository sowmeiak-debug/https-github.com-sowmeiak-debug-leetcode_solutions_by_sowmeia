class Solution {
    public int[] sortArrayByParityII(int[] nums) {
      int even=0,odd=1;
      int n=nums.length;
      while(even<n && odd<n){
        if(nums[even]%2==0)
        even+=2;
        if(nums[odd]%2!=0)
        odd+=2;
        else{
            int tem=nums[even];
            nums[even]=nums[odd];
            nums[odd]=tem;
        }
      } 
      return nums; 
    }
}