import java.util.*;
public class dpD{
    //Using Recursion
    public static void lcs(String s1, String s2, int n, int m){
        if(n==0||m==0){
            return;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            lcs(s1,s2,n-1,m-1);
            System.out.print(s1.charAt(n-1));
        }
        else{
            if(dp[n-1][m]>dp[n][m-1]){
                lcs(s1,s2,n-1,m);
            }
            else{
                lcs(s1,s2,n,m-1);
            }
        }
    }
    //Using Memoization tc O(n*m) sc O(n*m)
    static int[][] dp=new int[1001][1001];
    public static int fxn(String s1, String s2, int n, int m){
        if(n==0||m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=1+fxn(s1,s2,n-1,m-1);
        }
        else{
            return dp[n][m]=Math.max(fxn(s1,s2,n-1,m),fxn(s1,s2,n,m-1));
        }
    }

    public static void main(String[] args){
        String s1="abcde";
        String s2="ace";
        int n=s1.length();
        int m=s2.length();
        for(int i=0; i<1001; i++){
            for(int j=0; j<1001; j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(fxn(s1,s2,n,m));
        lcs(s1,s2,n,m);
        
    }
}