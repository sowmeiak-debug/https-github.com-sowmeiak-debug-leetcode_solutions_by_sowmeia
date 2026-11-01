class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      List<Integer> list=new ArrayList<>();
      Set<Integer> set=new HashSet<>();
      for(int i:nums){
        set.add(i);
      }
      int n=nums.length-1;
      Arrays.sort(nums);
      for(int i=nums[0];i<=nums[n];i++){
        if(set.contains(i))
        continue;
        else
        list.add(i);
      }
      return list;
    }
}