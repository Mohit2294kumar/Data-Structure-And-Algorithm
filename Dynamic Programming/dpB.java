public class dpB{
    //Using Recursion
    public static int climbStairs(int n){
        if(n==0||n==1){
            return 1;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
    //Using Memoization tc O(n) sc O(n)
    public static int fxn(int n, int[] dp){
        if(n==0||n==1){
            return 1;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fxn(n-1,dp)+fxn(n-2,dp);
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(climbStairs(n));
        int[] dp=new int[n+1];
        System.out.println(fxn(n,dp));
        //Using Tabulation tc O(n) sc O(n)
        int[] dp1=new int[n+1];
        dp1[0]=1;
        dp1[1]=1;
        for(int i=2; i<=n; i++){
            dp1[i]=dp1[i-1]+dp1[i-2];
        }
        System.out.println(dp1[n]);
    }
}