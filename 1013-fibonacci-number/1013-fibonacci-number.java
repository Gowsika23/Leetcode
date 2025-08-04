class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0] =0;
        dp[1] = 1;int f=dp[0], s=dp[1];
        int temp=0;
        for(int i=2;i<=n;i++){
            temp = f+s;
            f=s;
            s=temp;
           // sum = temp;
        }
        return temp;        
    }
}