class Solution {
    public int scoreOfString(String s) {
        int sum=0,sum2=0;
        for(int i=0;i<=s.length()-2;i++){
            int s1=(int)(s.charAt(i));
            int s2=(int)(s.charAt(i+1));
            if(s1>s2)
            sum=s1-s2;
            else
            sum=s2-s1;
            sum2+=sum;
        }
        return sum2;
    }
}