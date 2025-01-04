public class MultiDArray{
    public static void main(String[] args){
        int arr[][] = new int [2][2];
        arr[0][0] = 2;
        arr[0][1] = 9;
        arr[1][0] = 4;
        arr[1][1] = 8;
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int arr1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}