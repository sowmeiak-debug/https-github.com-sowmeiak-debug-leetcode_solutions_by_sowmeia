class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=nums[nums.length-1]){
                nums[i]++;
                count++;
            }
        }
        return count;
    }
}