class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int length=nums.length;
        int arr[]=new int[2];
        int l=0;
        HashMap<Integer,Integer> map=new HashMap<>();
          for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
       for (int key : map.keySet()) {
          if(map.get(key)==2){
          arr[l]=key;
          l++;
          }
        } 
        return arr;
    }
}