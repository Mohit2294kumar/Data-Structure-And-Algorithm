public class Main{
    public static int printDigit(int n){
        while(n>0){
            System.out.print(n%10+" ");
            n=n/10;
        }
        return n%10;
    }
    public static void main(String[] args){
        printDigit(4687455);
    }
}