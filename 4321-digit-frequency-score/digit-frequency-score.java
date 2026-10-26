class Solution {
    public int digitFrequencyScore(int n) {
           HashMap<Integer, Integer> map = new HashMap<>();
           int mul=0;
        while(n>0) {
            map.put(n%10, map.getOrDefault(n%10, 0) + 1);
            n/=10;
        }
        
        for (int key : map.keySet())    {
             mul+=key*(map.get(key));
        }
        return mul;
    }
}