class Solution {
    public boolean isSameAfterReversals(int num) {
      
      int a=0,b=0,f=num;
      while(f>0)
      {
        int d=f%10;
        a=a*10+d;
        f=f/10;
      }
      while(a>0)
      {
        int s=a%10;
        b=b*10+s;
        a=a/10;
      }
      return(b==num);
    }
}