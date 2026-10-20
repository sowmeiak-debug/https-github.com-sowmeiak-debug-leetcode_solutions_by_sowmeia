class Solution {
    public boolean judgeSquareSum(int c) {
        double l=0;
        double r=(int)Math.sqrt(c);
        while(l<=r){
            double d=(l*l)+(r*r);
            if(d==c){
                return true ;
            }
            else if(d<c)
            l++;
            else if(d>c)
            r--;
        }
        return false;
    }
}