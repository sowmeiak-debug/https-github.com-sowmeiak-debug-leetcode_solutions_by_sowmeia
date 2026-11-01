class Solution {
    public int minMergedInteger(int[] nums) {
       /*String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=Integer.toString(nums[i]);
        }*/
         long min = Long.MAX_VALUE;

        for (int i = 0; i < nums.length; i += 2) {
            long merged = Long.parseLong(
                String.valueOf(nums[i]) + nums[i + 1]
            );

            min = Math.min(min, merged);
        }

        return (int)min;
    }
}