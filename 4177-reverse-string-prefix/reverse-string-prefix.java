class Solution {
    public String reversePrefix(String s, int k) {
        String  str="";
        int h=k-1;
        while(h>=0){
            str+=s.charAt(h);
            h--;
        }
        str+=s.substring(k);
        return str;
    }
}