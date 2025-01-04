import java.util.Scanner;
public class SingleDArray{
    public static void main(String[] args){
        int arr1[] = new int[3];
        arr1[0] = 2;
        arr1[1] = 9;
        arr1[2] = 3;
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        int arr2[] = {23, 43, 35, 97};
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}