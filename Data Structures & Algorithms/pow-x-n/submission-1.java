class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long pow=n;
        if(n<0)
        {
            pow=-pow;
            x=1/x;
        }
        while(pow>0)
        {
            if(pow%2!=0)
                ans=ans*x;
            x=x*x;
            pow=pow/2; 
        }
        return ans;
    }
}
