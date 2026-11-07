class Solution {
    public boolean checkGoodInteger(int n) {
        int sum1=0, sum2=0;
        while(n>0){
            int r=n%10;
            sum1+=r;
            sum2+=(r*r);
            n/=10;
        }
        return ((sum2-sum1)>=50);
    }
}