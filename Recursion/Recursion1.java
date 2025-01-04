public class Recursion1{
    public static void fibonacci(int n, int a, int b) {
        if(n==0){
            //System.out.println(0);
            return;
        }
        System.out.print(a+" ");
        fibonacci(n-1, b, a+b);   
    }
    public static void main(String[] args){
        fibonacci(10, 0, 1);
    }
}