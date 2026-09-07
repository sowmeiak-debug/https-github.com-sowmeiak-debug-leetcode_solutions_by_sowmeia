class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int len=s.length();
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i)))
            count++;
        }
        int max=count,l=0;
        for(int i=k;i<len;i++){
            if(isvowel(s.charAt(i)))
            count++;
            if(isvowel(s.charAt(l++)))
            count--;
            max=Math.max(max,count);
        }
        return max;
    }

      boolean  isvowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
      
}}