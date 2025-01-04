import java.util.*;
public class TowerOfHanoi{
    public static void towerOfHanoi(int n, String source, String helper, String Destination){
        if(n==1){
            System.out.println("Transfer disk "+n+" for "+source+" to "+Destination);
            return;
        }
        towerOfHanoi( n-1, source, Destination, helper);
        System.out.print("Tranfer disk "+n+" from "+source+" to "+Destination);
        towerOfHanoi(n-1, helper, source, Destination);
    }
    public static void main(String[] args){
        int n = 1;
        towerOfHanoi(n,"s","h","d");
    }
}