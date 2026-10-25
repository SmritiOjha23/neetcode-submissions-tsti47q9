class Solution {
    public double myPow(double x, int n) {
        long pow=n;
        double result=1;
        if(n<0)
        {
            x=1/x;
            pow=-1*(n);
        }
        while(pow>0)
        {
            if((pow&1)==1)
                result *= x;
            x=x*x;
            pow=pow>>1;
        }
        return result;
    }
}
