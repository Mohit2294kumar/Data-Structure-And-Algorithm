public class dpA{
    //Using Recursion
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    //Using Memoization
    public static int fib(int n, int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args){
        int n=10;
        System.out.println(fib(n));
        int[] dp=new int[n+1];
        System.out.println(fib(n,dp));
        //Using Tabulation
        int[] dp1=new int[n+1];
        dp1[0]=0;
        dp1[1]=1;
        for(int i=2; i<=n; i++){
            dp1[i]=dp1[i-1]+dp1[i-2];
        }
        System.out.println(dp1[n]);
    }
}